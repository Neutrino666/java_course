package module_3.lesson_14;

public class Rect extends Shape {

    public Rect(int size) {
        super(size, size);
    }

    public Rect() {
        super(10);
    }

    public Rect(int a, int b) {
        super(a, b);
    }

    @Override
    protected final int getPerimetr() {
        return (getSideA() + getSideB()) * 2;
    }
}