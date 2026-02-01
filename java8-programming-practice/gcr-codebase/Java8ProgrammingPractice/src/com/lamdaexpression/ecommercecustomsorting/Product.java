package com.lamdaexpression.ecommercecustomsorting;

public class Product {
	String name;
    int price;
    double rating;
    int discount;

    //Constructor to initialize the details of the product
    Product(String name, int price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    
    @Override
    public String toString() {
        return "Product Name : " + name + "\n"
             + "Price        : " + price + "\n"
             + "Rating       : " + rating + "\n"
             + "Discount     : " + discount + "%\n";
    }
}
