import java.util.*;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = 0;
        int i = 1;
        while(i<=n){
            add+=i;
            i++;
        }
    }
}
