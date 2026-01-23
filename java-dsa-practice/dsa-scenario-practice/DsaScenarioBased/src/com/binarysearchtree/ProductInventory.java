package com.binarysearchtree;

public class ProductInventory {
     ProductNode root;
     
     //Method to insert product
     ProductNode insert(ProductNode root, int sku, double price) {
         if (root == null)
             return new ProductNode(sku, price);

         if (sku < root.sku)
             root.left = insert(root.left, sku, price);
         else if (sku > root.sku)
             root.right = insert(root.right, sku, price);

         return root;
     }

     //Method to search product
     ProductNode search(ProductNode root, int sku) {
         if (root == null || root.sku == sku)
             return root;

         if (sku < root.sku)
        	
             return search(root.left, sku);
         else
             return search(root.right, sku);
     }

     //Method to update price
     void updatePrice(int sku, double price) {
         ProductNode product = search(root, sku);

         if (product != null) {
             product.price = price;
             
             System.out.println("Price updated for SKU " + sku);
         } 
         
         else {
             System.out.println("Product not found");
         }
     }

     //Displaying sorted products
     void inorder(ProductNode root) {
         if (root != null) {
             inorder(root.left);
             System.out.println("SKU: " + root.sku + ", Price: " + root.price);
             inorder(root.right);
         }
     }
 }