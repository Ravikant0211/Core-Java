package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
        System.out.println("Hello World!");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new FileNotFoundException("oops");
        }
    }


}
