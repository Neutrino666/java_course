package module_3.lesson_12;

import module_3.lesson_12.intheritance.Cat;
import module_3.lesson_12.intheritance.Lion;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        System.out.println(cat.isCanEatPersone());
        System.out.println(lion.isCanEatPersone());
    }

}
