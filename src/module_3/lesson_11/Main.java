package module_3.lesson_11;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // ArrayList<String> employees = getEmloyees();
        // employees.add("James");
        // employees.remove("Tom");
        // for (String employee : employees) {
        // System.out.println(employee);
        // }

        // ArrayList<Integer> numbers = new ArrayList<>();
        // for (int i = 0; i < 1000; i++) {
        // numbers.add(i);
        // }
        // for (int num : numbers) {
        // System.out.println(num);
        // }

        // ArrayList<String> names = getNames();
        // ArrayList<Integer> numbers = getNumbersArray(names.size());
        // ArrayList<String> result = new ArrayList<>();

        // for (int num : numbers) {
        // result.add(num + " - " + names.get(num));
        // }

        // for (String res : result) {
        // System.out.println(res);
        // }

        HashSet<String> names = getNames();

        for (String name : names) {
            System.out.println(name);
        }
    }

    // public static ArrayList<String> getEmloyees() {
    // ArrayList<String> employees = new ArrayList<>();
    // employees.add("Bob");
    // employees.add("Jhon");
    // employees.add("Max");
    // employees.add("Tom");
    // employees.add("Nick");
    // return employees;
    // }

    // public static ArrayList<String> getNames() {
    // ArrayList<String> names = new ArrayList<>();
    // names.add("Teo");
    // names.add("Garry");
    // names.add("Monika");
    // names.add("Ted");
    // names.add("Elon");
    // return names;
    // }

    // hashset
    public static HashSet<String> getNames() {
        HashSet<String> names = new HashSet<>();
        names.add("Teo");
        names.add("Garry");
        names.add("Monika");
        names.add("Ted");
        names.add("Elon");
        return names;
    }

    public static ArrayList<Integer> getNumbersArray(int num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}