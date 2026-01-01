package day1Practice;

public class MainFood {
	    public static void main(String[] args) {

	        Food food = new Food("Cheese Corn Pizza", 250);
	        Payment payment = new UpiPayment();

	        OrderFood order = new OrderFood();
	        order.placeOrder(food, payment);
	    }
	}
