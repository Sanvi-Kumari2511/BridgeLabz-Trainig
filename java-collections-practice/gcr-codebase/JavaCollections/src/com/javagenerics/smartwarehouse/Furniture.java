package com.javagenerics.smartwarehouse;

public class Furniture extends WarehouseItem {
	public Furniture(String name) {
        super(name);
    }

    public String getType() {
        return "Furniture";
    }
}
