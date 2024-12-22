public class RecursiveSearch {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int helper(Node head , int key){
        if(head == null) {
           return -1;
        }

        if(head.data == key) {
            return 0;
        }
        
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;

    }
    public int recSearch(int key) {
        return helper(head , key);

    }

    public static void main(String[] args) {
        RecursiveSearch l1 = new RecursiveSearch();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);

        System.out.println(l1.recSearch(4));
        System.out.println(l1.recSearch(10));
        
    }


}
