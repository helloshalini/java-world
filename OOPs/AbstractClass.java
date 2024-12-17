package OOPs;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Hen he = new Hen();
        he.eat();
        he.walk();

        // Animal a = new Animal(); // error

        Mustang myHorse = new Mustang();
        myHorse.eat();
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
        System.out.println("animal costructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("horse costructor called");
    }

    void changeColor(){
        color = " Dark brown";
    }

    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Hen extends Animal{

    Hen(){
        System.out.println("hen costructor called");
    }
    void changeColor(){
        color = "White";
    }

    void walk(){
        System.out.println("Walk on 2 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang costructor called");
    }
}
