package module_4.lesson_2;

public class Persone {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("name: " + name + "\nage: " + age);
    }

    @Override
    public String toString() {
        // return "Name: " + name + " Age: " + age;
        return String.format("test %s", name);
    }

}
