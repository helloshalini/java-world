public class SubarraySum {
    public static void printSubarraySum(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i<n.length ; i++){
            int start = i;
            for(int j = i ; j<n.length ; j++){
                int end = j;
                currSum = 0;
                for(int k = start ; k<=end ; k++){
                    currSum += n[k];
                }
                
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int n[] = {1, -2, 6, -1, 3};
        printSubarraySum(n);
    }
}
