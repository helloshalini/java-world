public class linearSearch {
    public static int linear_search(int n[] , int items){
        for(int i = 0 ; i<n.length ; i++){
            if(n[i]==items){
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int n[] = {6 ,5,8,1,9,2,4};
        int item = 2;
        
        int index = linear_search(n , item);
        if (index == -1) {
            System.out.println("not found");
        }else{
            System.out.println("item is found at index: "+ index);
        }
    }
}
