public class product {
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.err.println(prod);
        prod = multiply(10, 20);
        System.err.println(prod);
    }
}
