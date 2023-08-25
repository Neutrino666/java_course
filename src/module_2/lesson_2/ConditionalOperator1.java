public class ConditionalOperator1 {

    public static void main(String[] args) {
        int temp = 20;
        if (temp > 25) {
            System.out.println("Кондиционер: вкл");
        } else if (temp < 22) {

            System.out.println("Кондиционер: выкл");
        } else {
            System.out.println("Температура оптимальная");
        }
    }
}