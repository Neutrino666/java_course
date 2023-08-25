public class Main {

    public static void main(String[] args) {
        // Box box1 = new Box();
        // box1.height = 10;
        // box1.length = 10;
        // box1.width = 10;
        // Box box2 = new Box();
        // box2.height = 20;
        // box2.length = 20;
        // box2.width = 20;
        // double volume1 = box1.height * box1.length * box1.width;
        // double volume2 = box2.height * box2.length * box2.width;
        // System.out.println(volume1);
        // System.out.println(volume2);

        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.name = "Petr";
        human1.age = 24;
        human1.weight = 66;
        human2.name = "Andru";
        human2.age = 45;
        human2.weight = 78;
        human3.name = "Karl";
        human3.age = 88;
        human3.weight = 76;
        double avg_age = (human1.age + human2.age + human3.age) / 3.0;
        System.out.println(avg_age);
    }
}