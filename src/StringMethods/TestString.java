package StringMethods;

public class TestString {
    public static void main(String[] args) {
       /* String name = "Ravi kant";
        int length = name.length();
        char c = name.charAt(length - 1);
        String name2 = "Ravi Kant";
        System.out.println(name.equals(name2)); // false
        System.out.println(name.equalsIgnoreCase(name2)); // true*/


       /* String str1 = "remote";
        String str2 = "ramote";
        System.out.println('r' + 0); // 114
        System.out.println('c' + 0); // 99
        int i = str1.compareTo(str2);
        System.out.println(i); // 4*/

        /*String name1 = "ravi kant";
        String name2 = "RAVI KANT";
        System.out.println(name1.compareToIgnoreCase(name2)); // 0*/


        /*String name = "Ravi kant";
        String substring = name.substring(2, 8);
        System.out.println(name.subSequence(2, 8);
        System.out.println(substring);*/

        /*String name = "Ravi kant";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());*/

        /*String name = "    Ravi kant    ";
        System.out.println(name.trim());*/

      /*  String name = "Ravi kumar kumar";
        String newName = name.replace("kumar", "kant");
        String newName2 = name.replace("a", "o");
        System.out.println(newName);
        System.out.println(newName2);*/


        /*String name = "Amar Panchal";
        System.out.println(name.contains("P"));
        System.out.println(name.contains("ch"));
        System.out.println(name.contains("Pan"));
        System.out.println(name.contains("fd"));*/

       /* String name = "Amar Panchal";
        System.out.println(name.startsWith("Am"));
        System.out.println(name.endsWith("al"));*/

        /*String str = "   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true
        System.out.println(name.indexOf('a')); // 2
        System.out.println(name.lastIndexOf('a')); // 10*/

        String formattedStr = String.format("My name is %s and I am %d years old.", "Ravi kant", 27);
        System.out.println(formattedStr); // My name is Ravi kant and I am 27 years old.

    }
}
