package staticKeyword;

public class Test {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();
//        Student student4 = new Student();
//        Student student5 = new Student();
        Student.getCount();
        System.out.println(Utils.trimAndUpperCase("ravi kant"));;
    }
}

// Static keyword: The static keyword in Java is used for memory management primarily.

// It can be applied to variables, methods, blocks, and nested classes.



// The main concept behind static is that it belongs to the class rather than instances of the class.

// The static method can not use non-static data member or call non-static method directly.

// This and super can not be used in static context.

// static block is used for setting static variables or performing some kind of one time setup task.

// Static members are initialised before the creation of any object.
