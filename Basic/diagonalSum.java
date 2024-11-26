public class diagonalSum {
    public static int diagonal_sum(int matrix[][]){
        int sum = 0 ;
        for(int i = 0 ; i<matrix.length ; i++){
            sum+=matrix[i][i];

            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = { {1 ,2 ,3 ,4} , {5 ,6 ,7,8} , {8, 9, 10, 11} , {12 , 13 ,14 ,15} };
        System.out.println(diagonal_sum(matrix));
    }
}
