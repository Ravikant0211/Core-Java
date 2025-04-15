package staticKeyword;

public class Utils {
    public static final double PI = 3.14;

//   14 static {
//        PI = 3.14159;
//    }

    public static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public static String trimAndUpperCase(String str) {
        if (str != null) {
            return str.trim().toUpperCase();
        }
        return str;
    }
}
