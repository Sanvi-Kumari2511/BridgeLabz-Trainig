package day1Practice;

public class OrderFood {

	    // Polymorphism
	    public void placeOrder(Food food, Payment payment) {
	        food.showFood();
	        payment.pay(food.getPrice());
	        System.out.println("Your order is placed successfully");
	    }
	}
