import java.util.*;

public class LinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 98);
        lhm.put("US", 90);
        lhm.put("Uk", 200);
        lhm.put("Korea", 100);

        System.out.println(lhm);
    }
}
