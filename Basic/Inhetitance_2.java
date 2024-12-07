// Multi - Level Inheritance

public class Inhetitance_2 {
    public static void main(String[] args) {
        Dog bob = new Dog();
        bob.eat();
        bob.legs = 4;
        System.out.println(bob.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.err.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Mammel extends Animal{
    int legs;

    void run(){
        System.out.println("Run");
    }
}

class Dog extends Mammel{
    String breed;
}
