package D02_Polymorphism;
//3. Animal Sound Example Base class Animal with method makeSound().
//Subclasses Dog, Cat, Cow override it.
//Demonstrate calling makeSound() using Animal reference

// Base class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meowww Meowww!");
    }
}

// Subclass Cow
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo Moo!");
    }
}

// Main class to demonstrate runtime polymorphism
public class AnimalSound {
    public static void main(String[] args) {
        Animal animal;// reference of base class

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}