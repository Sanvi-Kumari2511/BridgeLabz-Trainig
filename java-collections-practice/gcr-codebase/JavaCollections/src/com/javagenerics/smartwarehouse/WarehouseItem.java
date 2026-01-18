package com.javagenerics.smartwarehouse;

public abstract class WarehouseItem {
	String name;

	//Constructor to initialize details of warehouse
    public WarehouseItem(String name) {
        this.name = name;
    }
    
    public abstract String getType();

    @Override
    public String toString() {
        return getType() + ": " + name;
    }
}
