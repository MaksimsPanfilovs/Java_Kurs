package homework_16;

import java.util.Arrays;
import java.util.Random;

/*
Task 5
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */
public class Home16Task05 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] digit = new int[random.nextInt(11) + 5];
        int i = 0;
        int min = 0;
        int max = 0;
        int summ = 0;
        int aver = 0;

        System.out.print("[");
        while (i < digit.length) {
            digit[i] = random.nextInt(100) - 50;
            System.out.print(digit[i] + (i != digit.length - 1 ? ", " : "]\n"));

            if (digit[i] < min) {
                min = digit[i];

            } else if (digit[i] > max) {
                max = digit[i];

            } else if (i < digit.length) {
                summ = digit[i]++;
                aver = summ / digit.length;
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Среднее арифметическое всех значений в массиве: " + aver);


    }
}
