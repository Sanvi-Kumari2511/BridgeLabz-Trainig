package day1Practice;

public class MainAccount {
	
	    public static void main(String[] args) {
	        SavingsAccount saving = new SavingsAccount(10000, 10);
	        Customer c1 = new Customer("Sanvi", "0192ac3455");

	        saving.deposit(50000);
	        saving.withdraw(3000);
	        saving.addInterest();

	        c1.showDetails();
	    }
	}

