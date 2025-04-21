package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY.toString().toLowerCase());
        System.out.println(Day.MONDAY);

        Day monday = Day.MONDAY;
        monday.display();
        System.out.println(monday.getLower());

        int ordinal = monday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.name());

        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);

        Day[] values = Day.values();
        for (Day i : values) {
            System.out.println(i);
        }

    }
}
