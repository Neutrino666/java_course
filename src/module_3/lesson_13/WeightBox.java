package module_3.lesson_13;

public class WeightBox extends Box {
    private double weight;

    public WeightBox() {
        this(100);
    }

    public WeightBox(double size) {
        super(100);
        this.weight = 100;
    }

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    // public WeightBox copy() {
    // return new WeightBox(length, width, height, weight);
    // }

    // public WeightBox increase() {
    // return new WeightBox(length * 2, width * 2, height * 2, weight * 2);
    // }

    // public void setDimens(double length, double width, double height, double
    // weight) {
    // this.length = length;
    // this.width = width;
    // this.height = height;
    // this.weight = weight;
    // }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("weight: " + weight);
    }

}