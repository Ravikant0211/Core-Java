package oop.abstraction;

public abstract class Animal {

    private int age;

    private String name;
    // Abstract method
    public abstract void sayHello();

    // Concrete method
    public void sleep() {
        System.out.println("zzz...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
