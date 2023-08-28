package module_3.lesson_14;

public abstract class Shape {
    private int sideA;
    private int sideB;

    public final int getSideA() {
        return sideA;
    }

    public final int getSideB() {
        return sideB;
    }

    public Shape(int size) {
        this(size, size);
    }

    public Shape() {
        this(10);
    }

    public Shape(int a, int b) {
        sideA = a;
        sideB = b;
    }

    protected abstract int getPerimetr();

    public void showPerimetr() {
        System.out.println("perimetr - " + getPerimetr());
    }
}
