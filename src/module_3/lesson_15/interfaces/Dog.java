package module_3.lesson_15.interfaces;

public class Dog extends Animal implements AbleToRun {

    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

}
