package module_3.lesson_4;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        length = 10;
        width = 10;
        height = 10;
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
