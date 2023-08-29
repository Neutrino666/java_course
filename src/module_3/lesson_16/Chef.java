package module_3.lesson_16;

public class Chef implements Worker, Driver {

    @Override
    public void work() {
        System.out.println("Готовит еду");
    }

    @Override
    public void drive() {
        System.out.println("Повар едет на машине");
    }
}
