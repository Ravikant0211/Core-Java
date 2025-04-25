package multithreading.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is a Engineering student";
            }
        };

        Student bioStudent = name -> name + " is a Bio student"; // Lambda expression

        System.out.println(engineeringStudent.getBio("Ravi kant"));
        System.out.println(bioStudent.getBio("Mohit kumar"));
    }
}
