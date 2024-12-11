public class Sum {
    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int s1 = calSum(n-1);
        int sn = n + s1;
        return sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));
    }
}
