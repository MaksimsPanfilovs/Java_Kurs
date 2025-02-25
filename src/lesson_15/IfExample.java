package lesson_15;

import java.util.Random;

public class IfExample {
    public static void main(String[] args) {


        // Условный оператор if - позволяет выборочно выполнять отдельные части программы (блоки кода)

        // if (условие) оператор:

        /*
         if (условие) {
             Код при условии = true
         }else if (условие 2) {
             Код при условии2 = true
         }else {
             Код при условии = false
         }
         */

        int age = 5;

        if (age >= 18) System.out.println("Вы совершинолетний");
        else System.out.println("Вам меньше 18 ");

        System.out.println("Продолжение программы ");

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребёнок");
        }else {
            // Блок кода else (выполнится, когда условие выдаст false)
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age = " + age);
        }

        System.out.println("\n=============\n");
        Random rand = new Random();

        int score = rand.nextInt(101); // получить случайное число в диапазоне от 0 до 100

        if (score >= 90) {
            System.out.println("Супер! " + score);
        } else if (score >= 75) {
            System.out.println("Хорошо! " + score);

        } else if (score >= 50) {
            System.out.println("Удовлетворительно! " + score);

        }else {
            System.out.println("Плохо! " + score);

        }

        System.out.println("Продолжение программы ");

        // Ctrl + Alt + O - оптимизировать импорты

        //        int v2 = rand.nextInt(51) - 25; //  (0...50) -- -0-25 -> -25; 50 - 25 = max = 25;

        // -25 до +25

        // -20 до 80 ->
//        int r4 = rand.nextInt(101) - 20;
        // Java 17 or higher
//        r4 = rand.nextInt(10, 70);
//        System.out.println("r4: " + r4);


        // Нахождение минимального значения из нескольких чисел
        int v1 = rand.nextInt(51); // случяйное число от 0 до 50 вкл
        int v2 = rand.nextInt(51);
        int v3 = rand.nextInt(51);

        System.out.println(v1 + " | " + v2 + " | " + v3);


        int min = v1;
        if(v2 < min) {
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println("min " + min);

    }
}
