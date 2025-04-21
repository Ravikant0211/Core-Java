package enums;

public enum Day {
    SUNDAY("Sunday"), // Instances of Day
    MONDAY("Monday"), // Instances of Day
    TUESDAY("Tuesday"), // Instances of Day
    WEDNESDAY("Wednesday"), // Instances of Day
    THURSDAY("Thursday"), // Instances of Day
    FRIDAY("Friday"), // Instances of Day
    SATURDAY("Saturday"); // Instances of Day

    private String lower;

    private Day(String lower) {
        System.out.println("Our constructor called.");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    public void display() {
        System.out.println("Today is " + this.name());
    }
}
