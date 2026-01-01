package day1Practice;

class SavingsAccount extends Account {
	
	    private double interestRate;
	    
            //Constructor
	        SavingsAccount (double balance, double interestRate) {
	        super(balance);
	        this.interestRate = interestRate;
	    }

	        
	    //Method to add the interest
	    public void addInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Added interest: " + interest);
	    }
	}




