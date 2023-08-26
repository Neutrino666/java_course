package module_3.lesson_2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bob";
        dog.breed = "pit bull";
        dog.weigh = "10";
        System.out.println(dog.getInfo());
    }
}
