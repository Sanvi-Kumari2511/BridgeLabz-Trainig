package com.bookbazar;
/*15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates. */

 class Book implements IDiscountable {
	 
	     protected String title;
	     protected String author;
	     protected double price;

	     //Stock should not be modified directly
	     private int stock;

	     //Constructor without offer
	     public Book(String title, String author, double price, int stock) {
	         this.title = title;
	         this.author = author;
	         this.price = price;
	         this.stock = stock;
	     }

	     //Getter for stock
	     public int getStock() {
	         return stock;
	     }

	     //Method to reduce stock safely (encapsulation)
	     public void reduceStock(int quantity) {
	         if (quantity <= stock) {
	             stock -= quantity;
	         } else {
	             System.out.println("Insufficient stock for " + title);
	         }
	     }

	     //Default discount (Override)
	     public double applyDiscount(int quantity) {
	         return 0;
	     }
	 }
