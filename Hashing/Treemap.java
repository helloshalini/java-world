import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 98);
        tm.put("US", 90);
        tm.put("Nepal", 200);
        tm.put("Korea", 100);

        System.out.println(tm);
        
    }
}
