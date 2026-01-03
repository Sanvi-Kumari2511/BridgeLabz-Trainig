package com.stackandqueue;

public class MainStockSpan {

	    public static void main(String[] args) {

	        //Stock prices for consecutive days
	        int[] prices = {100, 80, 60, 70, 60, 75, 85};

	        //Calculating stock span
	        int[] span = StockSpanProblem.calculateSpan(prices);

	        //Displaying results
	        System.out.println("Stock Prices:");
	        for (int price : prices) {
	            System.out.print(price + " ");
	        }

	        System.out.println("\n\nStock Span:");
	        for (int i = 0; i < span.length; i++) {
	            System.out.print(span[i] + " ");
	        
	        }
	    }
	}

