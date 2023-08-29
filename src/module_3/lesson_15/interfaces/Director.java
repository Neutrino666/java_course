package module_3.lesson_15.interfaces;

public class Director implements Worker {

    @Override
    public void work() {
        System.out.println("Руководит людьми");
    }

}
