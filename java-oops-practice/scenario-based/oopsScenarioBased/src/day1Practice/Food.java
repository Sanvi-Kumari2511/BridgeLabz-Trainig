package day1Practice;

public class Food {
	    protected String name;
	    private double price;
        
	    //Constructor of Food class
	    Food(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
        
	    public double getPrice() {
	        return price;
	    }

	    public void showFood() {
	        System.out.println(name + " : " + price);
	    }
	}


