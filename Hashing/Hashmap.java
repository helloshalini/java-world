import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put
        hm.put("India", 100);
        hm.put("China", 98);
        hm.put("US", 90);
        System.out.println(hm);

        // get
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);


    }
}
