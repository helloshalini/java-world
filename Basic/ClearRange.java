public class ClearRange {
    public static int clearBIts_in_range(int n , int i , int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMarks = a|b;
        return n & bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(clearBIts_in_range(10 , 2 , 4));
    }
}