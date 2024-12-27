import java.util.*;

public class ReverasalQueue {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) {
            s.push(q.remove());
        }

        while(!s.isEmpty()) {
            s.add(s.pop());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // print
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " "); 
        }
        System.out.println();
    }
}
