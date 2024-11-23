public class binarySearch {
    public static int binary_search(int n[] , int item){
        int start = 0 , end = n.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(n[mid] == item){
                return mid;
            }
            if(n[mid]<item){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[] = {1, 2 ,3 ,5 ,7 ,8,9};
        int item = 9;

        System.out.println("index is: "+ binary_search(n, item));
    }
}
