package Day_03;

import java.util.Scanner;

public class PrintLinkedListElements_1 {
    static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }
    public static void main(String args []) {
        Node head = new Node(16);
        head.next = new Node(13);



        printLinkedList(head);
    }
}
