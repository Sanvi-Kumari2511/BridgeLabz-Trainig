package Day_12.Bank_03;

public class BankAccount {
    private double balance;
    protected String accountType;
    String branchCode;

    public BankAccount(double balance, String accountType, String branchCode) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        this.accountType = accountType;
        this.branchCode = branchCode;
    }

        public void deposit (double amount) {
            if (amount < 0) {
                System.out.println("Invalid amount");
                return;
            }
            balance += amount;
        }
        public void withdraw (double amount) {
            if(amount < 0){
                System.out.println("Invalid amount");
                return;
            }

            if(amount > balance){
                System.out.println("Insufficient balance");
                return;
            }
            balance -= amount;
        }

        public double getBalance(){
        return balance;
        }
}
