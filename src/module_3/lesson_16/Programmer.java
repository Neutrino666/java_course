package module_3.lesson_16;

public class Programmer implements Worker, Driver {

    @Override
    public void work() {
        System.out.println("Пишет код");
    }

    @Override
    public void drive() {
        System.out.println("Программист едет на машине");
    }
}
