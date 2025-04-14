package oop.Inheritance.multiLevelInheritance;

public class Parent extends GrandParent {
    public Parent(String name, int age) {
        super(name, age);
        System.out.println("Parent constructor called!");
    }

    public void parentMethod() {
        System.out.println("Parent Method Called!");
    }
}
