package lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int x;
        x = 10;

        int[] array; // Объявление массива целых чисел
        int array1[]; // Альтернативный способ объявления, НЕ РЕКОМЕНДУЕТСЯ использовать
        String[] strings; // Объявление массива строк

        array = new int[4]; // создали (инициализировали) массив int с 4 ячейками
        strings = new String[10]; // Создали массив строк на 10 ячеек

        int[] array2 = new int[8]; // объявление инициализация массива int с 8 ячейками
        boolean[] bools = new boolean[3];

        /*
        Значение по умолчанию для типа данных:
        1. Для всех числовых типов (в том числе тип char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для всех ссылочных типов данных - null. (null - ничто)
         */

        // Получить из массива значение, находящиеся в ячейке с индексом 0
        int value = array2[0];
        System.out.println("array2[0]: " + value); // 0
        System.out.println("array2[7]: " + array2[7]); // 0

        System.out.println( "bools[1]:" +bools[1]); // false

        System.out.println("strings[9]: " + strings[9]); // null

        System.out.println("x: " + x);


        // Распечатать все значения в массиве так не получится
        System.out.println(array2); // Получим ссылку на адрес я ячейке памяти Heap (где хранятся значения)

        // Явная инициализация массива значениями
        int[] numbers = new int[]{45, 56, -16, 0, 159}; // Будет создан массив размером = кол-ву элементов в {} скобках
        int[] ints = {-10, 54, 32333, 444}; // короткая форма явной инициализации

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // Присвоение нового значения в 2 ячейку
        int len = numbers.length; // длина массива (кол-во ячеек в массиве)
        System.out.println("numbers.length: " + len);


        // Перебрать индексы от 0 до len - 1
        System.out.println("Вывести все значения массива");
        int i = 0;
        while (i < numbers.length){
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        // Создать массив на 10 элементов и заполнить его случайными числами от 0 до 100 включительно

        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length){
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");
        System.out.println("С новой строки");

        // Найти минимальное значение в массиве

        int min = num[0];

        if (num[1] < min) min = num[1];
        if (num[2] < min) min = num[2];
        if (num[4] < min) min = num[3];
        if (num[5] < min) min = num[5];
        if (num[6] < min) min = num[6];
        if (num[7] < min) min = num[7];
        if (num[8] < min) min = num[8];
        if (num[9] < min) min = num[9];

        System.out.println("min: " + min);


        while (i < num.length){
            if (num[i] < min){
                min = num[i];
            }
            i++;
        }
        System.out.println("минимальное значение в массиве: " + min);





    }
}
