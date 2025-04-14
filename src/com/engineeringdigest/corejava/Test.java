package com.engineeringdigest.corejava;

public class Test {
    public static void main(String[] args) {
        // Whole numbers
            // byte
            // short
            // int
            // long
        byte age1 = 127;
        short age2 = 32767;
        int age3 = 2147483647;
        long age4 = 2147483650l;
        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Long.MIN_VALUE); // -9223372036854775808
        System.out.println(Long.MAX_VALUE); // 9223372036854775807

        // Decimal numbers
            // float
            // double
        float mySalary = 1000.11112311121212121f;
        double yourSalary = 1000.111123112121212121;
        System.out.println(mySalary); // 1000.11115
        System.out.println(yourSalary); // 1000.1111231121212

        // Float Range
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        // Double Range
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        // characters
            // char
        char initial = 'a';
        System.out.println((int) Character.MIN_VALUE); // 0
        System.out.println((int) Character.MAX_VALUE); // 65535
        char heartSymbol = 10084;
        char rightSymbol = '\u27A4';
        System.out.println(heartSymbol); // ❤
        System.out.println(rightSymbol); // ➤
        char hindiChar = 2309;
        System.out.println(hindiChar); // अ
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E and F


        // ASCII value - 0 to 127 values
        for (int i = 0; i <= 127; i++) {
            System.out.println((char) i);
        }


        // booleans
            // boolean
        boolean isEligible = false;
        System.out.println(isEligible);


    }
}
