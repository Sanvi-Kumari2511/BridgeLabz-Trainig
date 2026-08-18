package Day_13_Section3_and_4;

public class BankAccount_02 {
    String accountHolder;
    double balance;
    BankAccount_02(){
        this("Unknown", 0);
    }

    BankAccount_02(String accountHolder){
        this(accountHolder, 0);
    }

    BankAccount_02(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display(){
        System.out.println(accountHolder);
        System.out.println(balance);
    }
}

class SavingsAccount extends BankAccount_02{
    double interestRate;
    SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate =  interestRate;
    }
}

 class Main1{
     public static void main(String[] args) {
         SavingsAccount s = new SavingsAccount("Sanvi",100000, 5);
         s.display();
         System.out.println(s.interestRate + "%");
     }
}