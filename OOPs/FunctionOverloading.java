package OOPs;

public class FunctionOverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.err.println(sum(2,4));
        System.err.println(sum(2.3f , 3.34f));
    }
}
