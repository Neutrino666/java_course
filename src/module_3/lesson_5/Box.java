package module_3.lesson_5;

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

    double getVolume() {
        return length * height * width;
    }

    void showVolume() {
        System.out.println(getVolume());
    }

}
