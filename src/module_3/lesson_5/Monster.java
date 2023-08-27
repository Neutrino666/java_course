package module_3.lesson_5;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    Monster(int param) {
        this(param, param, param);
    }

    Monster() {
        this(2);
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
