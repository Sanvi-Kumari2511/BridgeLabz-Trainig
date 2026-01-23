package com.binarysearchtree;

public class BinarySearch {
   Node root;
   Node insert(Node root, int roll) {
	   if(root == null) 
		   return new Node(roll);
	 
		   if(roll < root.roll) 
			   root.left = insert(root.left, roll);
		  
		   else if(roll > root.roll) 
			   root.right = insert(root.right, roll);

  
		   return root;
   }
   
   boolean search(Node root, int roll) {
	   if(root == null) 
		   return false;
	   
	   if(root.roll == roll) 
		   return true;
	   
	   if(roll < root.roll) 
		   return search(root.left, roll);
	   else 
		   return search(root.right, roll);
	   
   }
	   void inorder(Node root) {
		   if(root != null) {
			   inorder(root.left);
			   System.out.println(root.roll + " ");
			   inorder(root.right);
		   }
		   
	   }
	   
	   Node minValueNode(Node node) {
		  Node current = node;
		  while(current.left != null) {
			  current = current.left;
		  }
			  return current;
		  
	   }
		  
	   Node delete(Node root, int roll) {
		   if(root == null) 
			   return root;
		   
		   if(roll < root.roll) 
			   root.left = delete(root.left, roll);
			   
			   else if(roll > root.roll) 
				   root.right = delete(root.right, roll);
			   else {
				   if (root.left == null)
						   		   
				   return root.right;
			   
				   else if(root.right == null)
					   return root.right;
			
		   Node temp = minValueNode(root.right);
		   root.roll = temp.roll;
		   root.right = delete(root.right, temp.roll);
	   }
	   return root;
	   }
			   
}






    