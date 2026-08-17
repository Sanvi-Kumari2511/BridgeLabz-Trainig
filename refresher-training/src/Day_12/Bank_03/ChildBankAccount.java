package Day_12.Bank_03;

public class ChildBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, "Savings","BR01");

        System.out.println("Account Type:" + account.accountType);
        System.out.println("Branch Code:" + account.branchCode);
        account.withdraw(1500);

        System.out.println("Balance:" + account.getBalance());
    }


}
