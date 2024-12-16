public class CountSets {
    public static int count_set_bits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_set_bits(15));
    }
}
