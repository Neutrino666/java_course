package module_3.lesson_16;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        // // Programmer programmer = new Programmer();
        // // director.force(programmer);

        director.force(new Worker() { // экземпляр анонимного класса
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });

    }
}
