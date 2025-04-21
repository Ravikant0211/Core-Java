package exceptionHandling;

public class Test2 {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception o) {
//            StackTraceElement[] stackTrace = o.getStackTrace();
//            for (StackTraceElement stackTraceElement : stackTrace) {
//                System.out.println(stackTraceElement);
//            }
            o.printStackTrace();
        }
    }

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
