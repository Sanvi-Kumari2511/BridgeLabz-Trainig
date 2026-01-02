package com.ewalletapplication;

public class EWalletApp {

	    public static void main(String[] args) {
            
	    	//Wallet
	        Wallet w1 = new PersonalWallet(5000, 500); 
	        Wallet w2 = new BusinessWallet(10000);

	        //User
	        User u1 = new User("Sanvi", w1);
	        User u2 = new User("Sandip", w2);

	        //Fund transfers
	        u1.getWallet().transferTo(u2, 2000);
	        u2.getWallet().transferTo(u1, 3000);

	        //Displaying balances
	        System.out.println("Sanvi Balance: " + u1.getWallet().getBalance());
	        System.out.println("Sandip Balance: " + u2.getWallet().getBalance());

	        //Transaction history
	        Transaction t1 = new Transaction("Sanvi", "Sandip", 1000);
	        t1.showTransaction();
	    }
	}

