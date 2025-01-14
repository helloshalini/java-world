import java.util.*;

public class InterateHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 98);
        hm.put("US", 90);
        hm.put("Uk", 200);
        hm.put("Korea", 100);

        // Iteration
        Set<String> keys = hm.keySet(); 
        System.out.println(keys);

        for(String k : keys) {
            System.out.println("keys="+k+ ",values="+hm.get(k));
        }

    }
}
