package module_3.lesson_10;

public class Persone {
    private String name;
    private int age;

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("name: " + name + "\nage: " + age);
    }

}
