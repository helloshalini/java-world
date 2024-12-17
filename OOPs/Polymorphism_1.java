//Method Overloading

public class Polymorphism_1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(1,3));
        System.out.println(cal.Sum((float)1.3,(float)13.3));
        System.out.println(cal.Sum(1,3,9));
    }
}

class Calculator { 
    int Sum(int a , int b){
        return a+b;
    }

    float Sum(float a , float b){
        return a+b;
    }

    int Sum(int a , int b , int c){
        return a+b+c;
    }
}
