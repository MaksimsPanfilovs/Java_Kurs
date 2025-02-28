package homework_16;

import java.util.Arrays;

/*
Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */
public class Home16Task06 {
    public static void main(String[] args) {

        int[] ints = {5, 6, -25, 0, 31, -15};
        int i = 0;
        int min = ints[0];
        int minI = 0;
        int max = ints[0];
        int maxI = 0;

        System.out.print("{");
        while (i < ints.length) {
            System.out.print(ints[i] + (i != ints.length - 1 ? ", " : "} -> {"));
            if (ints[i] < min) {
                min = ints[i];
                minI = i;
            }
            if (ints[i] > max) {
                max = ints[i];
                maxI = i;
            }
            i++;
        }
        int temp = ints[minI];
        ints[minI] = ints[maxI];
        ints[maxI] = temp;
        Arrays.stream(ints).forEach(value -> System.out.print(value + ", "));
        System.out.print("\b\b" + "}\n");







    }
}
