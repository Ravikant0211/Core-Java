package oop.Inheritance;

import oop.Inheritance.multiLevelInheritance.Child;

public class Test {
    public static void main(String[] args) {
        Child child = new Child("Ram", 18);
        System.out.println(child.getAge());
        child.childMethod();
    }
}
