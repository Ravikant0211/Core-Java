package dataTypes;

public class TestString {
    public static void main(String[] args) {
        String x = "Ram"; // string pool
        String a = new String("Ram"); // Heap memory
        String b = new String(x); // // Heap memory
        String c = "Ram"; // // string pool
        String d = "Ram"; // // string pool
        System.out.println(a == b); // false
        System.out.println(c == d); // true
    }
}
