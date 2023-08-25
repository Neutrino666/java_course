public class Array {

    public static void main(String[] args) {
        // String[] namesOfMonth = new String[12];
        // namesOfMonth[0] = "January";
        // namesOfMonth[1] = "Febraury";
        // namesOfMonth[2] = "March";
        // namesOfMonth[3] = "April";
        // namesOfMonth[4] = "May";
        // namesOfMonth[5] = "June";
        // namesOfMonth[6] = "July";
        // namesOfMonth[8] = "August";
        // namesOfMonth[7] = "September";
        // namesOfMonth[9] = "October";
        // namesOfMonth[10] = "November";
        // namesOfMonth[11] = "December";
        // for (int i = 0; i < namesOfMonth.length; i++) {
        //     System.out.print(namesOfMonth[i]);
        //     if (i != namesOfMonth.length - 1) {
        //         System.out.print(", ");
        //         continue;
        //     }
        //     System.out.print(".");
        // }
        
        int [] numbers = {4, 1, 11,43, 14};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}