public class reverse {
    public static void reverse_array(int n[]){
        int first = 0 , last = n.length-1;
        while(first<last){
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int n[] = {2, 4, 56 ,67 ,3};
        reverse_array(n);
        for(int i= 0 ; i<n.length ; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}
