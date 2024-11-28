public class substring {
    public static String sub_String(String str , int si , int ei){
        String substr = "HelloWorld";
        for(int i = si ; i<ei ; i++){
            substr+=str.charAt(i);
        }
       return substr;
    }
    public static void main(String[] args) {
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));
    }
}
