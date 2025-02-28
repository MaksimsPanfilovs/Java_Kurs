package homework_23;
/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */
public class EmployeeInLec {

    private String name;
    private int age;
    private double salary;

    // Alt + Insert(Einfg) -> Constructor
    public EmployeeInLec(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void info() {
        System.out.printf("Employee name: %s, age: %d, salary: %.2f\n", name, age, salary);
    }


}
