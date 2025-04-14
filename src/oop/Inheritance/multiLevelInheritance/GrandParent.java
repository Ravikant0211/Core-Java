package oop.Inheritance.multiLevelInheritance;

public class GrandParent {
    private String name;
    private int age;
    boolean hasSuperPowers;

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    public GrandParent(String name, int age) {
        this.name = name;
        this.age = age;
        hasSuperPowers = false;
        System.out.println("Grandparent constructor called!");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) age = 0;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
