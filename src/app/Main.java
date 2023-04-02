package app;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        int c = add(a, b);
        System.out.println(c);
        int f = subtraction(a, b);
        System.out.println(f);
        int d = multiply(a, b);
        System.out.println(d);
        printResult(division(a, b));

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static double division(int a, int b) {
        return ((float) a) / b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static void printResult(double output) {
        System.out.println(output);
    }
}
