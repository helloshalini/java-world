// import java.util.*;
public class typePromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        System.out.println(a);
        System.out.println(b-a);

        short s = 2;
        byte by = 56;
        char ch = 'c';
        byte bt = (byte) (s + by + ch);
        System.out.println(bt);
    }
}
