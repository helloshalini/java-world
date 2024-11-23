public class pattern4 {
    public static void hallow_rectangle(int totRows , int totCols){
        for(int i = 1 ; i<=totRows ;i++){
            for(int j = 1 ; j<=totCols ;j++){
                if(i==1 || i == totRows || j==1 || j == totCols){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow_rectangle(4 , 5);
    }
}
