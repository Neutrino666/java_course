package module_3.lesson_13.intheritance;

public class Lion extends CatFamily {

    public Lion() {
        super(4, 2, true);
        legs = 5;
    }

    @Override
    public void eat() {
        System.out.println("Резкими рывками, разрывая плоть антилопы: ");
        super.eat();
    }

}
