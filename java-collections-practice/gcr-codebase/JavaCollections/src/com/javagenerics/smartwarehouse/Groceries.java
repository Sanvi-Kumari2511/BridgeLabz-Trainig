package com.javagenerics.smartwarehouse;

public class Groceries extends WarehouseItem {
	public Groceries(String name) {
        super(name);
    }

    public String getType() {
        return "Groceries";
    }
}
