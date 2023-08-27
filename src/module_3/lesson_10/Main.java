package module_3.lesson_10;

public class Main {
    public static void main(String[] args) {
        // String s = "1000";
        // String s1 = "2000";
        // // конкатенация
        // System.out.println(s + s1);
        // int a = Integer.parseInt(s);
        // int b = Integer.parseInt(s1);
        // // сложение
        // System.out.println(a + b);

        String s = "This is Jhon. He is 27 years old.";
        String name = s.substring(8, 12);
        int age = Integer.parseInt(s.substring(20, 22));

        Persone persone = new Persone(name, age);
        persone.showInfo();

    }
}
