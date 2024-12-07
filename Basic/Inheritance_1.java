// Singled Level Inhetitance

public class Inheritance_1 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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