public class SubarraySum1 {
    public static void printSubarraySum(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n.length];

        prefix[0] = n[0];
        for(int i = 1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + n[i];
        }

        for(int i = 0 ; i<n.length ; i++){
            int start = i;
            for(int j = i ; j<n.length ; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

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
