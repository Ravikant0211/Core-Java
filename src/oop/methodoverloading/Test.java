package oop.methodoverloading;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = sumOfArray(arr);
        System.out.println(ans);

        System.out.println(upperFun(" ravi kant "));
        System.out.println();
    }

    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    private static String upperFun(String str) {
        return str.trim().toUpperCase();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static float sum (float a, float b) {
        return a + b;

    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
