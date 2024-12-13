public class TilingProblem {
    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vc = tiling_problem(n-1);
        int hc = tiling_problem(n-2);

        int totWays = vc + hc;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling_problem(4));
    }
}
