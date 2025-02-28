package homework_17;

import java.util.Random;

/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.

Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class Home17Task04 {
    public static void main(String[] args) {



        int range = 50;
        int[] numbers = new int[range];

        fillArray(numbers);
        printArray(numbers);

        System.out.println("\n========================\n");
        System.out.println("Найдены простые числа: ");

        long v1 = 0;
        long v2 = 0;


        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i]; // Число, которое проверяем на каждой итерации цикла

            boolean isSimple = true;

            //Проверяю числа на простоту

            if (num < 2) continue; // Число, не является простым. Берём дальше

            for (int j = 2; j < num; j++){
                v1++;
                if (num % j == 0){
                    isSimple = false;
                    break;
                }
            }

            if (num == 2 || num == 3 ) {
                //Число простое. Переходим к следующему
                // Но сначала надо "учесть" - вывести в консоль
                System.out.print(num  + ", ");
                continue;
            }

            if (num % 2 == 0 || num % 3 == 0) {
                isSimple = false; // число не является простым
                continue;
            }

            for (int k = 5; k * k <= num; k += 6) { // k <= Math.sqrt(num)
                v2++;
                if (num % k == 0 || num % (k + 2) == 0 ) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple){
                // Число прошло проверку

                System.out.print(num + ", ");
            }
        }
        System.out.println();
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);



    }

    public static void fillArray(int[] numbers){
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(110) - 10; // -100....9_900
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {  // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? " , " : "]\n"));

        }
    }




}
