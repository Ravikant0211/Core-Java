package oop.Inheritance.multiLevelInheritance;

public class Child extends Parent{
    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child constructor called!");
    }

    public void childMethod() {
        super.parentMethod();
        System.out.println("Child Method Called!");
    }
}
