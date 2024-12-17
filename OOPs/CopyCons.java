package OOPs;

public class CopyCons{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "nani";
        s1.rollNo = 56627;
        s1.password = "dfsf";
        s1.marks[0] = 87;
        s1.marks[1] = 83;
        s1.marks[2] = 92;

        Student s2 = new Student(s1);
        s2.password = "fsdha";
        s1.marks[2] = 100;
        
        for(int i =0 ;i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNo){
        marks = new int[3];
        this.rollNo = rollNo;
    }
}
