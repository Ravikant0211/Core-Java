package javaInterface.Animals;

public interface Animal {

    public static final int MAX_AGE = 150;

//  Modifier 'abstract' is redundant for interface methods
    public abstract void eat();

    void sleep();

    // Java 8 (JDK 8)
    public static void info() {
        System.out.println("This is an Animal interface.");
    }

    // Java 8 (JDK 8)
    public default void run() {
        this.eat();
        System.out.println("Animal is running.");
    }
}
