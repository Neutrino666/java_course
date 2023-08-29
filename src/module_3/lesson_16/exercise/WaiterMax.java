package module_3.lesson_16.exercise;

public class WaiterMax implements Waiter {

    @Override
    public void btingOrder(String dish) {
        System.out.println("Ваш заказ - " + dish + " готов!");
    }

}
