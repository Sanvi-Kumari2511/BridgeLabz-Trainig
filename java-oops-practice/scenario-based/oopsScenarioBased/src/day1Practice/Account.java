package day1Practice;

public class Account {
  double balance;
   
   //Constructor
   Account(double balance){
	   this.balance = balance;
   }
   
   //Method to deposit amount
   public void deposit(double amount) {
	   balance += amount;
	   System.out.println("Deposited amount is:" + amount);
   }
   
   //Method to withdraw amount
   public void withdraw(double amount) {
       if (amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn amount is: " + amount);
       }
       else {
           System.out.println("Your balance is insufficient");
       }
   }

   
   //Method to get the balance
   public double getBalance() {
       return balance;
   }
}
