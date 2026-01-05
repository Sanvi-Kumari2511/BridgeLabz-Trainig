package com.swiftcart;
//Cart class: holds a list of products and totalPrice.

import java.util.ArrayList;
   class Cart implements ICheckout {

	    private ArrayList<Product> products;
	    private double totalPrice;

	    //Empty cart constructor
	    Cart() {
	        products = new ArrayList<>();
	        totalPrice = 0;
	    }

	    //Cart with pre-selected items
	    Cart(ArrayList<Product> products) {
	        this.products = products;
	        calculateTotal();
	    }

	    void addProduct(Product product, int quantity) {
	        products.add(product);
	        totalPrice += product.price * quantity;   
	    }

	    private void calculateTotal() {
	        totalPrice = 0;
	        for (Product p : products) {
	            totalPrice += p.price;
	        }
	    }

	    public void applyDiscount(double couponAmount) {
	        double productDiscount = 0;

	        for (Product p : products) {
	            productDiscount += p.getDiscount();  
	        }

	        totalPrice = totalPrice - productDiscount - couponAmount;
	    }

	    public void generateBill() {
	        System.out.println("----- Total Bill -----");
	        for (Product p : products) {
	            System.out.println(p.name + " " + p.price);
	        }
	        System.out.println("Final Amount: " + totalPrice);
	    }
	}

