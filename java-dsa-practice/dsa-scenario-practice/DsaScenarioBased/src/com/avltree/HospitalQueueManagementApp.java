package com.avltree;

public class HospitalQueueManagementApp {
	public static void main(String[] args) {

        HospitalQueue queue = new HospitalQueue();

        //Patient registration
        queue.root = queue.insert(queue.root, 12, "Sanvi");
        queue.insert(queue.root, 18, "Shruti");
        queue.insert(queue.root, 6,  "Priyanshu");
        queue.insert(queue.root, 14, "Sandip");

        //Displaying patients by arrival time
        System.out.println("Patient Queue:");
        queue.inorder(queue.root);
    }
}
