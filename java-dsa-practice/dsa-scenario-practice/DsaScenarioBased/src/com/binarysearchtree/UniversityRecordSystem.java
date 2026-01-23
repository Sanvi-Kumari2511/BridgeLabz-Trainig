package com.binarysearchtree;

public class UniversityRecordSystem {
      public static void main(String args []) {

          BinarySearch tree = new BinarySearch();

          //Inserting student roll numbers
          tree.root = tree.insert(tree.root, 50);
          tree.insert(tree.root, 40);
          tree.insert(tree.root, 70);
          tree.insert(tree.root, 20);
          tree.insert(tree.root, 30);
          tree.insert(tree.root, 60);
          tree.insert(tree.root, 80);

          //Displaying sorted roll numbers
          System.out.print("Sorted Roll Numbers: ");
          tree.inorder(tree.root);
          System.out.println();

          //Searching
          System.out.println("Search Roll 50: " + tree.search(tree.root, 50));

          //Deleting
          tree.root = tree.delete(tree.root, 30);

          System.out.println("After Deletion (Roll 30): ");
          tree.inorder(tree.root);
      }
  }
 
    	    