
import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(6);
        List.add(2);
        List.add(1);
        List.add(9);
        List.add(5);
        
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<List.size() ; i++){
            if(max<List.get(i)){
                max = List.get(i);
            }
        }
        System.out.println("max element is "+max);
    }
}
