package Day_03;

public class InOrder_6 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(6);
        root.right.right.left.right = new Node(4);

        inOrder(root);
    }

}
