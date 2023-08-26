public class Variable {

    public static void main(String[] args) {
        int days = 365;
        int year = days / 365;
        int month = days % 365 / 30;
        int day = days % 365 % 30;

        System.out.printf("Лет:     %d\nМесяцев: %d\nДней:    %d", year, month, day);
    }
}