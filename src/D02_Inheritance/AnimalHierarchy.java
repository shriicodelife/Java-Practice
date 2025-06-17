package D02_Inheritance;
//6. Multilevel Inheritance: Animal Hierarchy
//Animal → Mammal → Dog
//Each class adds its own method (eat(), walk(), bark()).
//Show method access from an object of Dog.

// Base class
class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}
class Mammal extends Animal{
    public void walk() {
        System.out.println("Mammal walks on land");
    }
}
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog barks loudly");
    }
}
// Main class to test multilevel inheritance
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog();

        // Accessing methods from all levels
        myDog.eat();   // from Animal
        myDog.walk();  // from Mammal
        myDog.bark();  // from Dog
    }
}