package OOPs;

//Function Overriding

public class Polymorphism_2 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass only");
    }
}

