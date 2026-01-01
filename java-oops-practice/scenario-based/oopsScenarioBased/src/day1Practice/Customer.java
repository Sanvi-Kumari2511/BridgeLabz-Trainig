package day1Practice;

class Customer {
	private String name;
	private String accountNumber;
	
	//Constructor
	Customer (String name, String accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	//Method to show the details of customer
	public void showDetails() {
		System.out.println("Name of the customer is:" + name);
		System.out.println("Account number of the customer is: " + accountNumber);
	}
  
}
