package module_3.lesson_4;

public class Employee {
    String name;
    String position;
    double salary;

    Employee() {
        name = "Bob";
        position = "Engineer";
        salary = 1000;
    }

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("name: " + name +
                "\nposition: " + position +
                "\nsalary: " + salary);
    }
}
