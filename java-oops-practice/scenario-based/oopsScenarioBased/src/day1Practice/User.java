package day1Practice;

public class User {

	    String name;

	    User(String name) {
	        this.name = name;
	    }

	    public void applyLoan() {
	        System.out.println("Loan applied by user");
	    }

	    public void addToCart(Book book) {
	        System.out.println(book.title + " added to cart");
	    }
	}

