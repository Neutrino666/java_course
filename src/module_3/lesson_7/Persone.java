package module_3.lesson_7;

public class Persone {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
