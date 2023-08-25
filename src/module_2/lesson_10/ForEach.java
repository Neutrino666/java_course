public class ForEach {
    public static void main(String[] args) {
        // String[] names = {
        //     "Tom",
        //     "Piter",
        //     "Max",
        //     "Diego"
        // };
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }

        // for (String name : names) {
        //     System.out.println(name);
        // }

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 + i;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}