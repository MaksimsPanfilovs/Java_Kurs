package homeworks.homework_24;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление

Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Claculator {


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



}
