public class IntegerTypes{
    public static void main(String[] args) {
        
        // Неявное приведение типа
        long speed = 300_000;
        long distance = 365 * 24 * 60 *60 * speed;
        System.out.println(distance);
        
        // Явное приведение типа
        byte a = 10;
        a = (byte) (a + 10);
        System.out.println(a);
    }
} 