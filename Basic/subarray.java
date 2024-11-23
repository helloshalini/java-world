public class subarray {
    public static void printSubarray(int n[]){
        int ts = 0;
        for(int i = 0 ; i<n.length ; i++){
            int start = i;
            for(int j = 0 ; j<n.length ; j++){
                int end = j;
                for(int k = start ; k<=end ; k++){
                    System.out.print(n[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ts);
    }
    public static void main(String[] args) {
        int n[] = {2, 4, 56 ,67 ,3};
        printSubarray(n);
    }
}
