public class PowerBit {
    public static boolean isPower(int n){
        if((n & n-1) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPower(15));
    }
}
