package homework_15;

import java.util.Random;

/*
Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.

Output:
Максимальное число: 33
 */
public class Home15Task01 {
    public static void main(String[] args) {

        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println(num1 + " | " + num2 + " | " + num3 + " | " + num4);

        int max = num1;

        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num4 > max) max = num4;

        System.out.println("Максимальное число: " + max);

    }
}
