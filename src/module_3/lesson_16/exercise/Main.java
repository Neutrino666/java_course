package module_3.lesson_16.exercise;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        WaiterMax waiterMax = new WaiterMax();
        client.createOrder(new Waiter() { // анонимный класс

            @Override
            public void btingOrder(String dish) {
                System.out.println("Ваш заказ - " + dish + " готов!");
            }
        }, "Рыба");

        client.createOrder(waiterMax, "шашлык");
    }
}
