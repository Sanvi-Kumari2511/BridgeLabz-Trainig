package Day_13_Section3_and_4;

public class Account_05 {
    private double balance;

    Account_05(double balance){
        this.balance = balance;
    }
    protected double getBalance(){
        return balance;
    }
}

class CurrentAccount extends Account_05 {

    CurrentAccount(double balance){
        super(balance);
    }
    void showBalance(){

        //Error: balance has private access
        // System.out.println(balance);

        //Working: Protected method are accessible by its child class
        System.out.println(getBalance());
    }
}

class Main3{
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount(30000);

        c.showBalance();
    }
}