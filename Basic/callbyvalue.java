public class callbyvalue {
    public static void swap(int a , int b) {
        int temp = a;
         a=b;
         b=temp;
         System.err.println(a);
         System.err.println(b);
    }
    public static void main(String args[]) {
        swap(3, 4);
    }
}
