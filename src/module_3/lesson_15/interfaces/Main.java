package module_3.lesson_15.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // Dog dog = new Dog();
        // Bird bird = new Bird();
        // Fish fish = new Fish();
        // ArrayList<Animal> animals = new ArrayList<>();
        // animals.add(cat);
        // animals.add(dog);
        // animals.add(bird);
        // animals.add(fish);
        // for (Animal animal : animals) {
        // animal.eat();
        // }

        // Animal animal = new Dog();
        // animal.eat();
        // // animal.run(); // не работает потому что у родительского класса такого
        // метода
        // // нет
        // Dog dog = (Dog) animal; // приведет к типу Dog
        // dog.run();

        // Cat cat = new Cat();
        // Dog dog = new Dog();
        // Bird bird = new Bird();
        // ArrayList<AbleToRun> animals = new ArrayList<>();
        // animals.add(cat);
        // animals.add(dog);
        // animals.add(bird);
        // for (AbleToRun animal : animals) {
        // animal.run();
        // }
        // AbleToFly ableToFly = new Bird();
        // ableToFly.fly();

        // AbleToRun ableToRun = new Dog(); // автоматический upcast

        Director director = new Director();
        Programmer programmer = new Programmer();
        Chef chef = new Chef();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(chef);
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(chef);
        for (Worker worker : workers) {
            worker.work();
        }
        for (Driver driver : drivers) {
            driver.drive();
        }
    }
}