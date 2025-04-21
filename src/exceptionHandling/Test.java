package exceptionHandling;

import oop.encapsulation.Student;

public class Test {
    public static void main(String[] args) {
        int[] numerators = { 400, 40, 30, 200};
        int[] denominators = { 10, 20, 0, 50 };
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Good Job :)");
    }

    public static int divide(int a, int b) {
        try {
           return  a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception :(");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;

        } finally {
            System.out.println("Good Job!");
        }
    }
}

// Exception Handling:
// 1. The exception handling is a way to handle the runtime errors so that the normal flow of the
// application can be maintained.

// 2. Exception is an event that disrupts the normal flow of the program. It is an object which is
// thrown at runtime.
