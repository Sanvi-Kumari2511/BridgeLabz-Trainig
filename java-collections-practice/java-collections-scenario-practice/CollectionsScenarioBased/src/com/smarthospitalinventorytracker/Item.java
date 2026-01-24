package com.smarthospitalinventorytracker;

import java.util.Objects;

public class Item <T> {
	private T itemId;
    private String itemName;
    private int quantity;
    private String expiryDate;

    //Constructor to initialize item's details
    public Item(T itemId, String itemName, int quantity, String expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    //Method to get item id
    public T getItemId() {
        return itemId;
    }

    //Method to get item name
    public String getItemName() {
        return itemName;
    }

    //Method to get quantity
    public int getQuantity() {
        return quantity;
    }

    //Method to get expiry date
    public String getExpiryDate() {
        return expiryDate;
    }

    //Used by Set to remove duplicate items based on ItemID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (!(obj instanceof Item)) return false;
        Item<?> other = (Item<?>) obj;
        
        return Objects.equals(itemId, other.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }
}
