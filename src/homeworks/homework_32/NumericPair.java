package homeworks.homework_32;
/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные
и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
 */
public class NumericPair<T> {

    private double num1;
    private double num2;

    public NumericPair(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
       return num1 + num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}

