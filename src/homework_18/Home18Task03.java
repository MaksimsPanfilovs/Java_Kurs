package homework_18;

import java.util.Arrays;
import java.util.Random;

/*
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Home18Task03 {
    public static void main(String[] args) {

        int[] digit = new int[30];

        arrayFilling(digit);
        System.out.println("\n========= Простые числа: ===========\n");
        findSimpleDigit(digit);
        System.out.println("\b\b" + "]");



    }//Method area

    public static void arrayFilling(int[] array){

        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100) - 25;
        }
        System.out.println(Arrays.toString(array));

    }
    public static int[] findSimpleDigit(int[] simpl){

        System.out.print("[");
        for (int i = 0; i < simpl.length; i++) {

            int number = simpl[i];
            boolean simples = true;

            if (number < 2) continue;

            if (number == 2 || number == 3){
                System.out.print(number + ", ");
                continue;
            }

            if (number % 2 == 0 || number % 3 == 0){
                simples = false;
                continue;
            }

            for (int n = 5; n * n >= number; n += 6){
                simples = false;
                if (number % n == 0 || number % (n + 2) == 0) break;
            }

            if (simples){
                System.out.print(number + ", ");
            }

        }
        return simpl;

    }


}//End class
