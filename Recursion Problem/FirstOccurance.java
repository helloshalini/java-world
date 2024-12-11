public class FirstOccurance {
    public static int first_Occurance(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first_Occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8 , 3, 3, 2, 5, 32 ,89 ,5 ,2};
        System.out.println(first_Occurance(arr, 2, 0));
    }
}
