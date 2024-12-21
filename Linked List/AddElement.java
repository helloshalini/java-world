public class AddElement {
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

    // Step 1 -> create new node
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


    public void print() { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx , int data) {
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i<idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        AddElement l1 = new AddElement();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.add(2,9);

        l1.print();

    }

}
