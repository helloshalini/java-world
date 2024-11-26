public class stairCase {
    public static boolean stairCase_search(int matrix[][] , int item){
        int row = 0 , col = matrix[0].length-1 ; 
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == item){
                System.out.println("found item at("+row+" , "+col+")");
                return true;
            }
            else if(item<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("item is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10 , 20 , 30 , 40} , 
        {15 , 25  , 35 , 45} , 
        {27 , 29 , 37 , 48} , 
        {32 , 33 , 39 , 50}};
        int item = 33;
        stairCase_search(matrix, item);
    }
}