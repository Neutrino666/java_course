package module_3.lesson_13.intheritance;

public class Cat extends CatFamily {

    public Cat() {
        super(4, 2, false);
    }

    @Override
    public void eat() {
        System.out.println("У миски раздаются звуки:");
        super.eat();
    }

}
