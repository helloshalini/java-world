//Hierrarchial Inheritance

public class Inheritance_3 {
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

class Fish extends Animal{
    int wings;

    void swim(){
        System.out.println("Swim");
    }
}

class Mammel extends Animal{
    int legs;

    void run(){
        System.out.println("Run");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}