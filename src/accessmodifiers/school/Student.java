package accessmodifiers.school;

public class Student {
    private String name;
    public int age;

    // private constructor:
    // 1. When class only have utilities methods and doesn't need to be instantiated
    // 2. When you want to make a singleton class
//    private Student() {}

    public void sayHello() {
        System.out.println("Hello");
    }
}

// Public: Properties or methods declared as public can be accessed from anywhere.

// Private: Properties or methods declared as private can only be accessed within the class.

// Protected: Properties or methods declared as protected can only be accessed within the extending classes.

// Default (No keyword): Properties or methods, having default access modifiers, can only be accessed within the same package
