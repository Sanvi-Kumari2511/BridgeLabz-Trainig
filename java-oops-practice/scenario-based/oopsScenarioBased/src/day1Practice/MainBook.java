package day1Practice;

public class MainBook {

	    public static void main(String[] args) {

	        User user = new User("Sanvi");
	        Book book = new Book("Java Basics", 599);
	        Loan loan = new Loan();
	        Order order = new Order();

	        user.addToCart(book);
	        user.applyLoan();

	        double emi = loan.calculateEMI(50000, 10);
	        System.out.println("EMI: " + emi);

	        order.checkout();
	    }
	}
