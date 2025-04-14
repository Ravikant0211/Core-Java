package oop.encapsulation;

public class Test {
    public static void main(String[] args) {
        // Default constructor
//        Student student = new Student();

        Student student1 = new Student("Ravi kant", 25, 311734);
        Student student2 = new Student("Mohit kumar");

        System.out.println(student1.getAge());
        System.out.println(student2.getName());
    }
}
