package com.binarysearchtree;

public class EcommerceProductInventory {

	    public static void main(String[] args) {

	        ProductInventory inventory = new ProductInventory();

	        //Inserting products
	        inventory.root = inventory.insert(inventory.root, 105, 999.99);
	        inventory.insert(inventory.root, 105, 599.99);
	        inventory.insert(inventory.root, 100, 1599.99);
	        inventory.insert(inventory.root, 103, 399.99);
	        inventory.insert(inventory.root, 107, 1499.99);

	        //Lookup
	        ProductNode p = inventory.search(inventory.root, 103);
	        if (p != null)
	            System.out.println("Product found → SKU: " + p.sku + ", Price: " + p.price);

	        //Price Updating
	        inventory.updatePrice(100, 1599.99);

	        //Sorted SKU List
	        System.out.println("\nSorted Product List:");
	        inventory.inorder(inventory.root);
	    }
}
