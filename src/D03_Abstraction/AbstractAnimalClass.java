package D03_Abstraction;
//2. Abstract Animal Class
//Create an abstract class Animal with abstract method sound().
//Extend it with Dog and Cat classes implementing sound().
//Demonstrate runtime method calls using abstract class reference.


    abstract class Animal {
        abstract void sound();

    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks: Woof Woof!");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows: Meow Meow!");

        }
    }
            public class AbstractAnimalClass {
                public static void main(String[] args) {
                    Animal animal;

                    animal = new Dog();
                    animal.sound();

                    animal = new Cat();
                    animal.sound();
                }
            }

