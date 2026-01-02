package com.ewalletapplication;

 class PersonalWallet extends Wallet {
        
	    //Constructor without bonus
	    PersonalWallet(double balance) {
	        super(balance);
	    }
        
	    //Constructor with referral bonus
	    PersonalWallet(double balance, double referralBonus) {
	        super(balance, referralBonus);
	    }

	    //Override
	    public void transferTo(User receiver, double amount) {

	        if (hasSufficientBalance(amount)) {
	            debit(amount);
	            
	            receiver.getWallet().credit(amount);
	            System.out.println("Personal wallet  successfully transfer");
	        }
	        else {
	            System.out.println("Insufficient balance in your personal wallet");
	        }
	    }
	}

