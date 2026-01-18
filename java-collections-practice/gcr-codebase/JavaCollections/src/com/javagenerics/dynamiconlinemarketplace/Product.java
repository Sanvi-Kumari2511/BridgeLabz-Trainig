package com.javagenerics.dynamiconlinemarketplace;

public class Product<T extends Category> {
	String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " | " + category.getCategoryName() + " | ₹" + price;
    }
}
