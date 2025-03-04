package homeworks.homework_25;
/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу

Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */

// Lombok - облегчает жизнь програмисту, но не все одобряют.
public class ClaculatorHome25 {

    public static final double PI = 3.141519;


    public static int addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.print("Результат сложения = ");
        return sum;

    }

    public static int subtraction(int num1, int num2) {
        int sum = num1 - num2;
        System.out.print("Результат вычитания = ");
        return sum;
    }

    public static int generation(int num1, int num2) {
        int sum = num1 * num2;
        System.out.print("Результат умножения = ");
        return sum;
    }

    public static double dividing(double num1, double num2) {
//        if (num2 == 0) return Integer.MAX_VALUE; // если делить тип данных int, чтобы программа не уходила в ошибку.
        double sum = num1 / num2;
        System.out.print("Результат деления = ");
        return sum;
    }

    public static double circleLenght(double r) {
        double fer = 2 * PI * r;
        System.out.print("Длина окружности = ");
        return fer;
    }

    public static double circleArea(double r) {
        double area = PI * r * r;
        System.out.print("Площадь круга = ");
        return area;
    }



}
