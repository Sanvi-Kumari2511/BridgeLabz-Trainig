package com.collectors.orderrevenuesummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderRevenue {
   public static void main(String args []) {
	   
	   //Creating a list of orders
	   List<Order> orders = List.of(
			   new Order("Sanvi", 2000.00),
			   new Order("Shivani", 1500.99),
			   new Order("Sandip", 2500.25),
			   new Order("Ashu", 3000.00)
			   );
	   
	   //Group by customer and sum total order amount
	   Map<String, Double> revenue =
			   orders.stream()
			         .collect(Collectors.groupingBy(
			        		 Order::getCustomer,
			        		 Collectors.summingDouble(Order::getAmount)
			        		 ));
	   
	   //Printing results
	   revenue.forEach((customer, total) -> System.out.println(customer + " : " + total));
   }
}
