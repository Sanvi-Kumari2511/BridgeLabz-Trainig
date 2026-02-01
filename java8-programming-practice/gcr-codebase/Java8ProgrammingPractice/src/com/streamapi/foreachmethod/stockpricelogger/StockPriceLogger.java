package com.streamapi.foreachmethod.stockpricelogger;

import java.util.ArrayList;
import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {

        //Creating a list to represent live stock price feed
        List<Double> stockPrices = new ArrayList<>();

        stockPrices.add(1500.00);
        stockPrices.add(1462.75);
        stockPrices.add(1648.20);
        stockPrices.add(2000.90);

        //Displaying stock prices using forEach()
        System.out.println("Live Stock Prices are:\n");

        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
