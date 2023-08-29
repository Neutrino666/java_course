package module_4.lesson_1.exception;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int[] nums = new int[a];
        try {
            int b = 7 / a;
            int c = Integer.parseInt("5");
            nums[a] = 1;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getClass());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getClass());
        }
        System.out.println("hello");
    }
}