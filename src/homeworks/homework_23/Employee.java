package homework_23;

/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */
public class Employee {

    private String name = "Иван Иванов";
    private int age = 35;
    private double salary = 3500.50;


    public String info() {
        String result = String.format("Имя работника %s, его возраст: %d, и он получает %.2f.", name, age, salary);
        return result;
    }

}
