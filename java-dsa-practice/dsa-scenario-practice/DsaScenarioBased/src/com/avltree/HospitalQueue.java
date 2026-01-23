package com.avltree;

public class HospitalQueue {
	PatientNode root;

    //Taking height of node
    int height(PatientNode node) {
        return node == null ? 0 : node.height;
    }

    //Balance factor
    int getBalance(PatientNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    //Right rotation
    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    //Left rotation
    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    //Inserting patient (Register)
    PatientNode insert(PatientNode node, int time, String name) {
        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        
        else if (time > node.time)
            node.right = insert(node.right, time, name);
        
        else
            return node;   

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        //AVL rotations
        if (balance > 1 && time < node.left.time)
            return rightRotate(node);

        if (balance < -1 && time > node.right.time)
            return leftRotate(node);

        if (balance > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    //Displaying patients by arrival time
    void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            
            System.out.println("Time: " + node.time + " | Patient: " + node.name);
            inorder(node.right);
        }
    }
}
