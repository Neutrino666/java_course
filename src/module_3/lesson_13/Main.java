package module_3.lesson_13;

import module_3.lesson_13.intheritance.Cat;
import module_3.lesson_13.intheritance.Lion;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // Lion lion = new Lion();

        // cat.eat();
        // lion.eat();
        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 20);

        box.showInfo();
        weightBox.showInfo();
    }

}