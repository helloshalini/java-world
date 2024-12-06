// import java.util.*;

public class Array2D {
    public static boolean search(int matrix[][] , int item){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix.length ; j++){
                if(matrix[i][j] == item){
                    System.out.print("("+ i +" , "+ j +")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // int n = matrix.length , m = matrix[0].length;

        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix.length ; j++)
            {
                // Scanner sc  = new Scanner(System.in);
                // matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix.length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix , 5);
    }
}
