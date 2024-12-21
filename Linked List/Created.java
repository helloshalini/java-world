

// import java.util.*;

public class Created {
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


    public void print() {
        if(head == null){
            System.out.println("Empty");
            return;
        }


        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Created l1 = new Created();
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addLast(3);
        l1.print();
        l1.addLast(4);
        l1.print();

    }

}

