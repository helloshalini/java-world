import java.util.*;

public class Double {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        deque.addLast(4);
        deque.addLast(5);

        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First element is " + deque.getFirst());
        System.out.println("First element is " + deque.getLast());

    }
}
