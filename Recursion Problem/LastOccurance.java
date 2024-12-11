public class LastOccurance {
    public static int last_Occurance(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = last_Occurance(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {8 , 3, 3, 2, 5, 32 ,89 ,5 ,2};
        System.out.println(last_Occurance(arr, 2, 0));
    }
}
