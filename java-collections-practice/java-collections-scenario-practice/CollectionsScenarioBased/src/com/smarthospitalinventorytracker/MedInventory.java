package com.smarthospitalinventorytracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class MedInventory {
	//Regex to validate date format dd-MM-yyyy
    private static final Pattern DATE_REGEX =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    //Formatter for parsing expiry date
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void processInventory(String filePath) throws Exception {

        //Set removes duplicate items automatically
        Set<Item<Integer>> uniqueItems = new HashSet<>();

        //Map to categorize items by name
        Map<String, List<Item<Integer>>> inventoryMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine(); 

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            
            int qty = Integer.parseInt(data[2]);
            String expiry = data[3];

            //Validate expiry date using regex
            if (!DATE_REGEX.matcher(expiry).matches()) {
                System.out.println("Invalid expiry date format: " + expiry);
                continue;
            }

            //Create item object
            Item<Integer> item = new Item<>(id, name, qty, expiry);

            //Check for critical low stock
            if (qty < 5) {
                throw new LowStockException("CRITICAL LOW STOCK: " + name + " (Qty: " + qty + ")");
            }

            uniqueItems.add(item);
        }
        
        br.close();

        //Categorize items and check expiry
        for (Item<Integer> item : uniqueItems) {

            inventoryMap.computeIfAbsent(item.getItemName(), k -> new ArrayList<>()).add(item);

            LocalDate expiryDate = LocalDate.parse(item.getExpiryDate(), FORMATTER);

            if (expiryDate.isBefore(LocalDate.now())) {
                System.out.println("EXPIRED ITEM: " + item.getItemName());
            }
        }

        //Displaying categorized inventory
        inventoryMap.forEach((category, items) -> {
            System.out.println("\nCategory: " + category);
            
            for (Item<Integer> i : items) {
                System.out.println("ID: " + i.getItemId() + ", Qty: " + i.getQuantity() + ", Expiry: " + i.getExpiryDate());
            }
        });
    }
}
