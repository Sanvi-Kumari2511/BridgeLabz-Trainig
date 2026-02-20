package com.transactionmanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {


	public boolean transferMoney(int fromAcc, int toAcc, double amount) {

		String deductSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";

		String addSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

		String insertTxn = "INSERT INTO transaction_history (from_account, to_account, amount) VALUES (?, ?, ?)";

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			//Check balance
			if (getBalanceInternal(conn, fromAcc) < amount) {
				System.out.println("Insufficient Balance!");
				conn.rollback();
				return false;
			}

			//Deduct amount
			try (PreparedStatement ps1 = conn.prepareStatement(deductSQL)) {
				ps1.setDouble(1, amount);
				ps1.setInt(2, fromAcc);
				ps1.executeUpdate();
			}

			//Add amount
			try (PreparedStatement ps2 = conn.prepareStatement(addSQL)) {
				ps2.setDouble(1, amount);
				ps2.setInt(2, toAcc);
				ps2.executeUpdate();
			}

			//Insert transaction record
			try (PreparedStatement ps3 = conn.prepareStatement(insertTxn)) {
				ps3.setInt(1, fromAcc);
				ps3.setInt(2, toAcc);
				ps3.setDouble(3, amount);
				ps3.executeUpdate();
			}

			conn.commit();
			return true;

		} 
		catch (Exception e) {
			try {
				if (conn != null)
					conn.rollback();
			} 
			catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				if (conn != null) {
					conn.setAutoCommit(true);
					conn.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	public double getBalance(int accId) {

		String sql = "SELECT balance FROM accounts WHERE account_id = ?";

		try (Connection conn = ConnectionProvider.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, accId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getDouble("balance");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return -1;
	}

	//Internal balance check
	private double getBalanceInternal(Connection conn, int accId) throws SQLException {

		String sql = "SELECT balance FROM accounts WHERE account_id = ?";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, accId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getDouble("balance");
			}
		}
		return 0;
	}

	
	public List<Transaction> getTransactionHistory(int accId) {

		String sql = "SELECT * FROM transaction_history WHERE from_account = ? OR to_account = ?";

		List<Transaction> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, accId);
			ps.setInt(2, accId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				list.add(new Transaction(rs.getInt("txn_id"), rs.getInt("from_account"), rs.getInt("to_account"),
						rs.getDouble("amount"), rs.getTimestamp("txn_data")));
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}