package Day_03;

 class InsertAtHeadInLinkedList_2 {
     static class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    static Node insertNodeAtHead(Node llist, int data) {
        Node newNode = new Node(data);
        newNode.next = llist;
        return newNode;
    }

    static void printList(Node head) {
    while(head != null) {
        System.out.print(head.data + " -> ");
        head = head.next;
    }

    System.out.println("NULL");
}

public static void main(String[] args) {
    Node head = null;
    head = insertNodeAtHead(head, 382);
    head = insertNodeAtHead(head, 484);
    head = insertNodeAtHead(head, 392);
    head = insertNodeAtHead(head, 975);
    head = insertNodeAtHead(head, 321);

    printList(head);

}

}
