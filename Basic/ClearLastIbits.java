public class ClearLastIbits {
    public static int clear_ith_bit(int n , int i){
        int bitMark = (~0)<<i;
        return n & bitMark;
    }
    public static void main(String[] args) {
        System.out.println(clear_ith_bit(15, 2));
    }
}
