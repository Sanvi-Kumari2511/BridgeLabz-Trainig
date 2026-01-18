package com.javagenerics.smartwarehouse;

public class Electronics extends WarehouseItem {
	public Electronics(String name) {
        super(name);
    }

    public String getType() {
        return "Electronics";
    }
}
