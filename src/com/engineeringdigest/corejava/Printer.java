package com.engineeringdigest.corejava;

import java.util.Locale;
import java.util.Map;

public class Printer {
    public static void main(String[] args) {
//        int a= 1;
//        int b = 2;
//        String c = "Sum";
//        System.out.println(a + b + c); // 3Sum
//        System.out.println(c + a + b); // Sum12
//        System.out.println(c + ": " + (a + b)); // Sum: 3

        double number = 123467.89;

        // Default locale
        System.out.printf("Default locale: %,.2f%n", number);

        // US locale
        System.out.printf(Locale.US, "US locale: %,.2f%n", number);

        // German locale
        System.out.printf(Locale.GERMANY, "German locale: %,.2f%n", number);
    }
}
