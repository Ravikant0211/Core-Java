package mathPackage;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int c = -11;
        int abs = Math.abs(c); // positive value

        double d = 1.12;
        double ceil = Math.ceil(d); // 2.0
        double floor = Math.floor(d); // 1.0
        double round = Math.round(d); // nearest value
        System.out.println(ceil);
        System.out.println(floor);
        System.out.println(round);

        int e = 144;
        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12, 2.1));

        System.out.println(Math.PI);

        System.out.println((int)(Math.random() * 10));

    }
}
