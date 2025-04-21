package wrapperClasses;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        Integer b = Integer.valueOf(1); // auto-boxing
        int c = b.intValue(); // auto-unboxing

        boolean hasGraphicCard = true;
        Boolean isAdult = true;
        Float f = 1.2f;
        Double d = 1.2;
        Character ch = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 123l;

        Integer aaa = 1;
        Integer bbb = 1;
        System.out.println(aaa.equals(b)); // true
    }
}

// Boxing- Converting a primitive variable into an object is called Boxing. Java does it automatically, so this process
// is called 'Auto-Boxing'.

// UnBoxing- Converting an object datatype into a primitive variable is called unboxing. Java does it automatically, so
// this process is called 'Auto-Unboxing'.
