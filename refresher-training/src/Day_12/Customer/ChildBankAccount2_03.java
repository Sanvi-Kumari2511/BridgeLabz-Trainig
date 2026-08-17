package Day_12.Customer;
import Day_12.Bank_03.BankAccount;

public class ChildBankAccount2_03 extends BankAccount{
    public ChildBankAccount2_03(){
        super(1000, "Savings", "BR01");
    }

    public void showDetails(){

        //Protected: accessible due to the subclass
        System.out.println("Account Type:" + accountType);

        //default: Cannot accessible from different package
        //System.out.println(branchCode);

       // public: accessible
        System.out.println("Balance:" + getBalance());
    }

    public static void main(String[] args) {
        ChildBankAccount2_03 account = new ChildBankAccount2_03();
        account.showDetails();

        account.withdraw(1500);

        System.out.println("Final Total Balance:" + account.getBalance());
    }
}
