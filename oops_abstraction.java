// Abstraction - only showing the required characterstics of an object and ignoring the rest.
// Abstraction can be achieved by using interfaces and abstract classes.

// Here we may not have to show the user Animal class .
// Because it's kinda irrelevant because all other animals are inheriting the Animal class.

abstract class Animal{
    //abstract function -> no need to implement it here.
    abstract void walk();
    //we can also have constructors inside abstract class
    Animal(){
        System.out.println("Creating a new Animal");
    }
    // Non abstract methods can exist inside an abstract class
    public void eats(){
        System.out.println("Animal can eat");
    }
}
class Horse extends Animal{
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class oops_abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
        // Horse horse1 = new Horse();
        //Abstract class cannot be instantiated.
        // Animal an = new Animal();
        // an.walk();
    }
}
// First base class' constructor will be called then derived class' constructor will be called.
