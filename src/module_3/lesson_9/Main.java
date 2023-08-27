package module_3.lesson_9;

public class Main {

    public static void main(String[] args) {
        // String[] employees = getEmloyees();
        // String[] newArray = new String[employees.length + 1];

        // for (int i = 0; i < employees.length; i++) {
        // newArray[i] = employees[i];
        // }
        // newArray[newArray.length - 1] = "James";
        // employees = newArray;
        // employees[0] = null;

        // String[] newestArray = new String[employees.length - 1];
        // for (int i = 0, j = 0; i < employees.length; i++) {
        // String employee = employees[i];
        // if (employee != null) {
        // newestArray[j] = employee;
        // j++;
        // }
        // }
        // employees = newestArray;
        // for (String employee : employees) {
        // System.out.println(employee);
        // }
        MyArrayList employees = getEmloyees();
        employees.add("James");
        employees.remove("Tom");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

    }

    public static MyArrayList getEmloyees() {
        // String[] employees = new String[5];
        // employees[0] = "Bob";
        // employees[1] = "Jhon";
        // employees[2] = "Max";
        // employees[3] = "Tom";
        // employees[4] = "Nick";
        // return employees;

        MyArrayList employees = new MyArrayList();
        employees.add("Bob");
        employees.add("Jhon");
        employees.add("Max");
        employees.add("Tom");
        employees.add("Nick");
        return employees;
    }
}
