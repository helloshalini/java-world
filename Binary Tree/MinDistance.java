public class MinDistance {
    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left , n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if(leftDist == -1) {
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }


    public static int minDist(Node root, int n1, int n2) {
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 6;


        System.out.println(minDist(root, n1, n2));
    }
}
