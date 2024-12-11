public class SortedOrNot {
    public static boolean inSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return inSorted(arr, i+1);
    }
    public static void main(String[] args) {
        // int arr[] = {1,3 ,5,7,8};
        int arr[] = {1,3 ,10,7,8};
        System.out.println(inSorted(arr, 0));
    }
}
