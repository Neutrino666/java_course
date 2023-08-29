package module_4.lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Persone persone = new Persone("Tom", 22);
        // System.out.println(persone);

        // Random number = new Random();
        // int a = number.nextInt(1, 4);
        // System.out.println(a);

        Random random = new Random();
        int dice;
        for (int i = 0; i < 100; i++) {
            dice = random.nextInt(7);
            String s = String.format("Ваше число %s", dice);
            System.out.println(s);
        }
    }
}
