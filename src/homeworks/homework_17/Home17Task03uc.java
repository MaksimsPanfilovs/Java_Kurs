package homework_17;
/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.

Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class Home17Task03uc {

    public static void main(String[] args) {

        double pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);

        System.out.println("powTwo(0): " + powTwo(0));

        System.out.println("powTwo(-1): " + powTwo(-2));

    }

    // Написть метод возвращающий 2 в степени x. x метод получает в качестве параметра
    public static double powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        boolean isPositive = x >= 0;

        // что если x отрицательный - отбросить знак числа
        if (x < 0) x *= -1;

        // вычесляем 2 ^ |x|
        double result = 1;
        // x = 2;
        for (int i = 1; i <= x; i++) {
            result = result * 2;
        }
        if (isPositive) {
            return result;

        }else {
            // 1 / double -> 1 / 4.0 -> 0.25
            return 1 / result;

        }
    }


}
