
import java.util.ArrayList;

public class Operations{
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        // 1. ADD ELEMENT
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        
        System.out.println(List);

        // 2. GET ELEMENT
        int element = List.get(2);
        System.out.println(element);

        // 3. REMOVE ELEMENT
        List.remove(2);
        System.out.println(List);

        // 4. SET ELEMENT AT INDEX
        List.set(2 , 10);
        System.out.println(List);

        // 5. CONTAINS ELEMENT
        System.out.println(List.contains(1));
        System.out.println(List.contains(13));


        //SIZE OF ARRAYLIST

        System.out.println(List.size());
                  //OR
        
        for(int i = 0 ; i<List.size() ; i++){
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
    }
}