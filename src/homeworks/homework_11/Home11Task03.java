package homework_11;

/*
Task 03
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.

Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.

Получается, у вас будет среднее арифметическое этих чисел в одной переменной.

Выведите на экран значение переменной.

Сколько программа отбросила в остаток при операции деления?
 */

public class Home11Task03 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;

        int summ = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Средние арифметическое: " + summ);


        int rest = (num1 + num2 + num3 + num4) % 4;
        System.out.println("Остаток деления: " + rest);

    }
}
