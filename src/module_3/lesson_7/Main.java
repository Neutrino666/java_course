package module_3.lesson_7;

public class Main {
    public static void main(String[] args) {
        Persone persone = new Persone("Bob", 15);
        persone.setAge(20);
        System.out.println("Name: " + persone.getName() + "\nAge: " + persone.getAge());
    }
}
