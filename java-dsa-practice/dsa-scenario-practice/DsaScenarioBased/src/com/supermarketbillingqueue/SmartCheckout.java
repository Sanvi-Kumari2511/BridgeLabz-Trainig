package com.supermarketbillingqueue;
import java.util.*;

public class SmartCheckout {
  
	//Queue for customer at checkpoint counter
	private Queue<Customer> customerQueue;
	
	//HashMap for item price
	private Map<String, Double> priceMap;
	
	//HashMap for item stock
    private Map<String, Integer> stockMap;
    
    //Constructor
    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }
    
    //Adding item to inventory
    public void addItemToStore(String item, double price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    //Adding customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.getCustomerName() + " joined the billing queue");
    }

    //Removing and process customer from queue
    public void processCustomer() {

        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll(); 
        System.out.println("\nBilling customer: " + customer.getCustomerName());

        double totalBill = 0;

        //Process each item
        for (Item item : customer.getItems()) {
            int availableStock = stockMap.getOrDefault(item.name, 0);

            if (availableStock >= item.quantity) {
                double price = priceMap.get(item.name);
                totalBill += price * item.quantity;

                //Update stock after purchase
                stockMap.put(item.name, availableStock - item.quantity);
            } 
            
            else {
                System.out.println("Insufficient stock for item: " + item.name);
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }

    //Displaying remaining stock
    public void showStock() {
    	
        System.out.println("\nRemaining Stock:");
        
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }   
    
}
