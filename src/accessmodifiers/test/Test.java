package accessmodifiers.test;

import accessmodifiers.school.Student;
import accessmodifiers.test.zoo.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();
    }
}

// Public: Properties or methods declared as public can be accessed from anywhere.

// Private: Properties or methods declared as private can only be accessed within the same class.

// Protected: Properties or methods declared as protected can only be accessed within the extending classes or within the same package.

// Default (No keyword): Properties or methods, having default access modifiers, can only be accessed within the same package

