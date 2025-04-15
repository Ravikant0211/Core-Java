package javaInterface;

public interface ABC {
    public static void main(String ...args) {
        System.out.println("Hello world, from interface!");
    }
}

// Since, interface can hava static methods, and JVM requires just 'main()' method to start the program.
// And hence, we can write 'main()' method in interface.