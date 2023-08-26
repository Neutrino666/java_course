package module_3.lesson_3;

public class Box {
    double length;
    double width;
    double height;

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
