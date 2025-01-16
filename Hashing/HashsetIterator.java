import java.util.*;

public class HashsetIterator {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Goa");
        cities.add("Kota");
        cities.add("Noida");
        cities.add("Delhi");

        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(String city : cities) {
            System.out.println(city);
        }
    }
}
