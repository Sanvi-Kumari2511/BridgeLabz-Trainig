package com.avltree;

public class TicketBooking {
	EventNode root;

    //Inserting new event
    EventNode insert(EventNode root, int time, String name) {
        if (root == null)
            return new EventNode(time, name);

        if (time < root.time)
            root.left = insert(root.left, time, name);
        else if (time > root.time)
            root.right = insert(root.right, time, name);

        return root;
    }

    //Finding minimum value node 
    EventNode minValueNode(EventNode node) {
        EventNode current = node;
        
        while (current.left != null)
            current = current.left;
        
        return current;
    }

    //Delete (cancel) event
    EventNode delete(EventNode root, int time) {
        if (root == null)
            return root;

        if (time < root.time)
            root.left = delete(root.left, time);
        
        else if (time > root.time)
            root.right = delete(root.right, time);
        
        else {
        	
            //One or no child
            if (root.left == null)
                return root.right;
            
            else if (root.right == null)
                return root.left;

            //Two children
            EventNode temp = minValueNode(root.right);
            root.time = temp.time;
            root.eventName = temp.eventName;
            root.right = delete(root.right, temp.time);
        }
        
        return root;
    }

    //Displaying events in upcoming order
    void inorder(EventNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Time: " + root.time + " | Event: " + root.eventName);
            inorder(root.right);
        }
    }
}
