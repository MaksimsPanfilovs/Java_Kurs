package homeworks.homework_48;

import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */
public class Task1To3 {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Random rd = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(150) - 50;
        }

        List<Integer> integers = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

//        List<Integer> sorted = new ArrayList<>();
//        for (Integer i : integers) {
//            if (i > 10) {
//                if (i % 10) {
//                    sorted.add(i);
//                }
//            }
//        }

        System.out.println(integers);

    }
}
