package Day_03;

public class PostOrder_7 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static void postOrder(Node root){

            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.right = new Node(2);
            root.right.right = new Node(5);
            root.right.right.left = new Node(3);
            root.right.right.right = new Node(6);
            root.right.right.left.right = new Node(4);

            postOrder(root);
        }
    }
}
