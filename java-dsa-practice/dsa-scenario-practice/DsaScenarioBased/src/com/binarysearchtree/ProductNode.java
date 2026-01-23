package com.binarysearchtree;

public class ProductNode {
   int sku;
   double price;
   ProductNode left, right;
   
   ProductNode(int sku, double price){
	   this.sku=sku;
	   this.price=price;
	   this.left=right=null;
   }
}
