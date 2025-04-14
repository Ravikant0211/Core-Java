package oop.polymorphism;

import oop.Inheritance.hierarchicalInheritance.Animal;
import oop.Inheritance.hierarchicalInheritance.Cat;
import oop.Inheritance.hierarchicalInheritance.Dog;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog(); // upcasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

//        Dog myDog = (Dog) dog; // downcasting
    }
}

// Polymorphism:- Polymorphism is a concept in object-oriented programming, that allows methods to do different things
// based on which object they are called upon.

// Polymorphism has two types- 1. Compile time polymorphism (static polymorphism)
//                             2. Run time polymorphism (Dynamic polymorphism / Dynamic method dispatch)

// Compile time polymorphism can be achieved by method overloading.

// Run time polymorphism can be achieved by method overriding.