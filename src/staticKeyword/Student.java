package staticKeyword;

public class Student {
    public static int count = 0;
    public int age = 10;
    public String name;

    static {
        count = 100;
        System.out.println("Hello");
    }

    public Student() {
        count++;
    }

    public static void getCount() {
        System.out.println(count);
    }
}
