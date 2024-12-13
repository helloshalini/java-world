public class UpdateIthBit {
    public static int set_ith_bit(int n , int i){
        int bitMarks = 1<<i;
        return (n | bitMarks);
    }

    public static int clear_ith_bit(int n , int i){
        int bitMarks = ~(1<<i);
        return (n & bitMarks);
    }

    public static int update_ith_bit(int n , int i , int newBit){
        if(newBit == 0){
            return clear_ith_bit(n, i);
        }
        else{
            return set_ith_bit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(set_ith_bit(10 , 2));
    }
}