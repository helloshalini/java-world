import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Goa");
        lhs.add("Kota");
        lhs.add("Noida");
        lhs.add("Delhi");

        System.out.println(lhs);

        lhs.remove("Goa");
        System.out.println(lhs);
    }
}
