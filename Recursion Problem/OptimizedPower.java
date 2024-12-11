public class OptimizedPower {
    public static int Optimized_Power(int x , int n){
        if(n == 0){
            return 1;
        }
        int halfPower = Optimized_Power(x , n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(Optimized_Power(2, 10));
    }
}
