package lessons.lesson_48.GroupindBy;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private String position;
    private String departament;

    public Employee(String name, double salary, int age, String position, String departament) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;
        this.departament = departament;
    }

    @Override
    public String toString() {
        return String.format("{%s : %.2f : %s : %s}", name, salary, position, departament);

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(departament, employee.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age, position, departament);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
