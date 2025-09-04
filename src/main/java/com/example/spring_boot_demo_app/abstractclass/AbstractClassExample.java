package com.example.spring_boot_demo_app.abstractclass;

// Abstract class
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {

        this.name = name;
    }

    // Abstract method (no body)
    abstract void makeSound();

    // Non-abstract method (has body)
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass that extends abstract class
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Implementing abstract method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// Another subclass
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Main class to test
public class AbstractClassExample {
    public static void main(String[] args) {

        Animal animal;
        animal = new Dog("Buddy");
        animal.makeSound();  // Buddy says: Woof! Woof!
        animal.sleep();      // Buddy is sleeping.

        animal = new Cat("Whiskers");
        animal.makeSound();  // Whiskers says: Meow!
        animal.sleep();      // Whiskers is sleeping.
    }
}
