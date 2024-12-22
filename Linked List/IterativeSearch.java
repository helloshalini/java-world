public class IterativeSearch {
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

        // Step 2 -> 
        newNode.next = head;
        // Step 3 ->
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

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key){
                return i; 
            }
            temp = temp.next; //key found
            i++;
        }

        //key not found
        return -1;
    }

    public static void main(String[] args) {
        IterativeSearch l1 = new IterativeSearch();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);

        System.out.println(l1.itrSearch(4));
        System.out.println(l1.itrSearch(10));
        
    }
}
