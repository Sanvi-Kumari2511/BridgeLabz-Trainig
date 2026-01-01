package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
	public static void processOrder(List<FoodItem> orderItems) {

        double grandTotal = 0;

        for (FoodItem item : orderItems) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price is: " + totalPrice);
            System.out.println("Discount is: " + discount);
            System.out.println("Final Price is: " + finalPrice);
            System.out.println("----------------------------");
        }

        System.out.println("Grand Total Amount is: " + grandTotal);
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Kadai Paneer", 350, 1));
        order.add(new NonVegItem("Chicken Curry", 500, 1));

        processOrder(order);
    }
}
