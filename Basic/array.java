public class array {
    public static void update(int marks[]){
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[] = {3 ,4, 54,6 ,6};
        update(marks);

        for(int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
