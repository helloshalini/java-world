public class countingSort {
    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            largest = Math.max(largest , arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i =0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i =0 ; i < arr.length ; i++){
            while(arr[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,5,2,9,20,10,1,4,6};
        counting_sort(arr);
        printArr(arr);
    }
}