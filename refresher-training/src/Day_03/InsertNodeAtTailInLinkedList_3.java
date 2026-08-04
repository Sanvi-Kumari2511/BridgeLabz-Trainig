package Day_03;

public class InsertNodeAtTailInLinkedList_3 {
    static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    static Node insertNodeAtTail(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertNodeAtTail(head, 141);
        head = insertNodeAtTail(head, 302);
        head = insertNodeAtTail(head, 164);
        head = insertNodeAtTail(head, 530);
        head = insertNodeAtTail(head, 474);

        printList(head);
    }
}



