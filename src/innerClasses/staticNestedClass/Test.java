package innerClasses.staticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayInfo();
        Computer.USB usb = new Computer.USB("TYPE-C");
    }
}
