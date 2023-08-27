package module_3.lesson_5;

public class Main {

    public static void main(String[] args) {
        // System.out.println(MyMath.multiple(10.2, 5.3));
        // System.out.println(Math.sqrt(4));

        // Box box = new Box(30);
        // box.showVolume();

        Monster monster = new Monster(4);
        monster.voice();
        monster.voice(3, "BrBrBr...AAAA");
        monster.voice(2);

    }
}