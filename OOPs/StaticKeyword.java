package OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.schoolName = "ABCD";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);

        // Student s3 = new Student();
        // System.out.println(s3.schoolName);
    }
}

class Student{
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

}

