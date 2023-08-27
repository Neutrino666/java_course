package module_3.lesson_6;

public class Main {

    public static void main(String[] args) {
        Box current = new Box(10);
        // Box another = current.copy();
        // another.setDimens(12, 23, 11);
        // int res = current.compare(another);
        // System.out.println(res);
        // Box box = new Box(another);
        // box.showVolume();
        Box another = current.increase();
        current.showVolume();
        another.showVolume();
    }
}
