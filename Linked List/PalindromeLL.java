public class PalindromeLL {
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
    
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // slow fast approach
    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next == null) {
            slow = slow.next; //+1
            fast = fast.next; //+2
        }
        return slow; //slow is my midNode 
    }

    public boolean checkPanidrome() {
        if(head == null || head.next != null) {
            return true;
        }
        // Step 1: find mid
        Node midNode = findMid(head);

        // Step 1: rever 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // Step 3: 
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLL l1 = new PalindromeLL();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();

        System.out.println(l1.checkPanidrome());
    }
}
