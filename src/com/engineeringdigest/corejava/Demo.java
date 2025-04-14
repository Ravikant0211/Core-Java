package com.engineeringdigest.corejava;

public class Demo {
    public static void main(String[] args) {
        int a = 10; // 4 bytes
        long b = a; // 8 bytes
        float c = a; // 4 bytes
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        float f = 1.7f;
        int g = (int) f;
        System.out.println(g);

        // Widening or implicit conversion (automatic conversion)
        byte byteValue = 10; //  1 byte
        short shortValue = byteValue; // 2 bytes
        int intValue = shortValue; // 4 bytes
        long longValue = intValue; // 8 bytes
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);


        // Narrowing conversion (Explicit conversion or manual conversion)
        double doublevalue = 123.456;
        float floatvalue = (float) doublevalue; // Narrowing conversion from double to float
        long longvalue =(long) floatvalue; // Narrowing conversion from float to long
        int intvalue = (int) longvalue; // Narrowing conversion from long to int

        System.out.println("double: " + doublevalue);
        System.out.println("float: " + floatvalue);
        System.out.println("long: " + longvalue);
        System.out.println("int: " + intvalue);


        long X = Long.MAX_VALUE; // 01111111  11111111  11111111  11111111  11111111  11111111  11111111  11111111
        System.out.println(X);  // 9223372036854775807
        int Y = (int) X; // 11111111  11111111  11111111  11111111
        System.out.println(Y); // -1


    }
}
