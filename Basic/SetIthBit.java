public class SetIthBit {
    public static int set_ith_bit(int n , int i){
        int bitMarks = 1<<i;
        return (n | bitMarks);
    }
    public static void main(String[] args) {
        System.out.println(set_ith_bit(10 , 2));
    }
}
