package module_3.lesson_8;

public class MyMath {
    public static final double PI = 3.14;

    public static int sum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }
}
