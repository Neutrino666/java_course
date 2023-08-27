package module_3.lesson_6;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        length = 100;
        width = 100;
        height = 100;
    }

    // вызывает другой конструктор с параметрами double x 3
    Box(double size) {
        this(size, size, size);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box another) {
        this(another.length, another.width, another.height);
    }

    Box copy() {
        return new Box(length, width, height);
    }

    Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }

    int compare(Box anotherBox) {
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

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * height * width;
    }

    void showVolume() {
        System.out.println(getVolume());
    }

}
