package com.javagenerics.smartwarehouse;
import java.util.*;

//Generic class 
public class Storage <T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();

	//Adding items to storage
    public void addItem(T item) {
        items.add(item);
    }

    //Getting all stored items
    public List<T> getItems() {
        return items;
    }
}
