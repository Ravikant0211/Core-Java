package oop.Inheritance.hierarchicalInheritance;

public class Animal {
    private String name;
    private int age;

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
        if (age < 0) age = 0;
        this.age = age;
    }

    public void eat() {
        System.out.println("This animal eats food");
    }

    public void sayHello() {
        System.out.println("...");
    }
}
