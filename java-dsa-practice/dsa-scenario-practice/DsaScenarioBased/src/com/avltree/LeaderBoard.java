package com.avltree;

public class LeaderBoard {
	
	    PlayerNode root;   

	    //Taking height of a node
	    int height(PlayerNode node) {
	        return node == null ? 0 : node.height;
	    }

	    //Calculating balance factor
	    int getBalance(PlayerNode node) {
	        return node == null ? 0 : height(node.left) - height(node.right);
	    }

	    //Right rotation 
	    PlayerNode rightRotate(PlayerNode y) {
	        PlayerNode x = y.left;
	        PlayerNode t2 = x.right;

	        //Performing rotation
	        x.right = y;
	        y.left = t2;

	        //Updating heights
	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        //Returning new root
	        return x;
	    }

	    //Left rotation 
	    PlayerNode leftRotate(PlayerNode x) {
	        PlayerNode y = x.right;
	        PlayerNode t2 = y.left;

	        //Performing rotation
	        y.left = x;
	        x.right = t2;

	        //Updating heights
	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        //Returning new root
	        return y;
	    }

	    //Inserting or updating player's score
	    PlayerNode insert(PlayerNode node, int score, String name) {

	        //Normal BST insertion
	        if (node == null)
	            return new PlayerNode(score, name);

	        if (score < node.score)
	            node.left = insert(node.left, score, name);
	        
	        else if (score > node.score)
	            node.right = insert(node.right, score, name);
	        
	        else
	            return node;   

	        //Updating height of ancestor node
	        node.height = 1 + Math.max(height(node.left), height(node.right));

	        //Checking balance
	        int balance = getBalance(node);

	        //LL Case
	        if (balance > 1 && score < node.left.score)
	            return rightRotate(node);

	        //RR Case
	        if (balance < -1 && score > node.right.score)
	            return leftRotate(node);

	        //LR Case
	        if (balance > 1 && score > node.left.score) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        //RL Case
	        if (balance < -1 && score < node.right.score) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        return node;
	    }

	    //Displaying top 10 players 
	    void showTopPlayers(PlayerNode node, int[] count) {

	        //Reversing in-order traversal (Right → Root → Left)
	        if (node != null && count[0] < 10) {
	            showTopPlayers(node.right, count);

	            if (count[0] < 10) {
	                System.out.println(node.name + " : " + node.score);
	                count[0]++;
	            }

	            showTopPlayers(node.left, count);
	        }
	  }

}
