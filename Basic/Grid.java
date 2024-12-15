public class Grid {
    public static int grid_ways(int i , int j , int m , int n ){
        //base case
        if(i == n-1 && j == n-1){ //condn for last cell
            return 1;
        }else if(i == n || j == n){ //boundary cross condn
            return 0;
        }


        int w1 = grid_ways(i+1, j, m, n);
        int w2 = grid_ways(i, j+1, m, n);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3 , m = 3;
        System.out.println(grid_ways(0, 0, m, n));
    }
}
