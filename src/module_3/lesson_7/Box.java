package module_3.lesson_7;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        length = 100;
        width = 100;
        height = 100;
    }

    // вызывает другой конструктор с параметрами double x 3
    public Box(double size) {
        this(size, size, size);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box copy() {
        return new Box(length, width, height);
    }

    public Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }

    public int compare(Box anotherBox) {
        double currentVolume = getVolume();
        double anotherVolume = anotherBox.getVolume();
        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private double getVolume() {
        return length * height * width;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}