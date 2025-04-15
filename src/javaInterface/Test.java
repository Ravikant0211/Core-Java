package javaInterface;

import javaInterface.Devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall(1234567890);
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}

// Interfaces:
// 1. Interface is the blueprint from class.
// 2. Using interfaces, we can achieve Multiple Inheritance and Abstraction.
// 3. Interface, in Java, can have abstract methods, static constants, static methods, and default methods.

// Difference between abstract class and interface:
// 1. In abstract class, there can be instance variables, and constructor to initialize them. While interface can't
//    have these things.

// 2. A class can extend only one abstract class, but many interfaces.