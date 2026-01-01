package day1Practice;
import java.util.*;

public class Cart {

	    List<Item> items = new ArrayList<>();

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void showCart() {
	        for (Item item : items) {
	            System.out.println(item.name + " - " + item.price);
	        }
	    }
	}

