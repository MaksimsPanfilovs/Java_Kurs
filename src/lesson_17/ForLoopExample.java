package lesson_17;

import java.util.Random;

public class ForLoopExample {
    public static void main(String[] args) {

        /*
        for (<Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>) {
            // Тело кода
        }а
         */

        // Вывести все числа от 0 до 10
        int j = 0;
        while (j < 10) {
            System.out.print(j + " , ");
            j++;
        }
        System.out.println();
        System.out.println("Состояние j после цикла " + j);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " , ");
        }
        System.out.println("После цикла for");

        // Запустится бесконечный цикл. Для цикла for ни один из блоков не является обязательным
        /*
        for ( ; ; ) {
            System.out.println("Hello World");
        }
         */
        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100_000) {
            System.out.print(i1 + " , ");
        }
        System.out.println();
        System.out.println("Состояние i1 после цикла " + i1);

        System.out.println("\n================\n");
        // В блоке инициализации может быть переменная любого типа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("\n=======================\n");

        int x = 1;
        int y = 2;

        int v = 15, u = 20;

        // Мы можем инициализировать и изменять любое кол-во переменных в блоках инициализации и/или изменений
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        System.out.println("\n============================\n");

        //Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
        //Вывести на экран:
        //

        //Максимальное значение в массиве
        //Среднее арифметическое всех значений в массиве

        Random random = new Random();

        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[ ");
        // [0...len - 2] -> " , " ; len - 1 -> "]\n
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // {-50....50 }
            System.out.print(ints[i] + (i < ints.length - 1 ? " , " : " ]\n"));
        }
//        System.out.println(" ]");
        // char gpt  - помощник поискать в интернете

        //Найти минимальное значение в массиве и вывести его в консоль


        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Минимальное значение в массиве: " + min);

        System.out.println("\n==========================\n");

        // continue, break

        for (int i = 0; i < 7; i++) {
            if (i == 3) continue; //continue - прервать текущую итерацию цикла и перейти к следующей итерации
            // Мы перейдём в блок изменений переменных (i++;) и потом в блок проверки условия
            //В текущей итерации все команды после continue будут пропущенны
            System.out.print(i + " , ");
        }
        System.out.println();


        for (int i = 0; i < 7; i++) {
            if (i == 3) break; // break - прекращает текущую итерацию и работу всего цикла
            // Все последующие итерации не будут выполнены (независимо от условия в блоке проверок)
            System.out.print(i + " , ");
        }
        System.out.println();

    }
}
