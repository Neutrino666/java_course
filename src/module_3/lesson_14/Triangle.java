package module_3.lesson_14;

public class Triangle extends Shape {
    private int sideC;

    public final int getSideC() {
        return sideC;
    }

    public Triangle(int size) {
        this(size, size, size);
    }

    public Triangle() {
        this(10);
    }

    public Triangle(int a, int b, int c) {
        super(a, b);
        sideC = c;
    }

    @Override
    public final int getPerimetr() {
        return getSideA() + getSideB() + getSideC();
    }
}