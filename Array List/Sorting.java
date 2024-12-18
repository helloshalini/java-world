
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(6);
        List.add(2);
        List.add(1);
        List.add(9);
        List.add(5);

        System.out.println(List);
        //Ascending order
        Collections.sort(List);
        System.out.println(List);

        //Decending order
        Collections.sort(List , Collections.reverseOrder());
        System.out.println(List);


    }
}
