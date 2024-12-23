import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // add element
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(0);
        System.out.println(l1);

        // delete element
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
}
