public class FibonacciNo {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int fn = f1 + f2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
