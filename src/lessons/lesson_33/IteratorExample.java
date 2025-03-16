package lessons.lesson_33;

/*
Есть два интерфейса Iterable и Iterator.

1. Iterable - означает, что объекты этого класса можно последовательно перебирать (интерироваться по ним)
 Один абстрактный метод: Iterator<T> iterator - возвращает итератор для этого набора элементов (коллекций).

2. Iterator<T> - собственно итератор, который позволяет обходить коллекцию.
    - boolean hasNext()
 */


import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
//            iterator.remove(); // без переопределения метода выдает ошибку
        }

        // Цикл for-each
        // При переборе циклом for-each

        /*
        for (ТипПеременной имяПеременной: коллекция) {
            // действие с переменной
        {
         */
        System.out.println("\n===================");

        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        // Вывести в консоль все числа, которые есть в списке умноженные на 2.
        for (Integer intCurrent  : integers) {
            intCurrent *= 2;
            System.out.println(intCurrent);
        }
        System.out.println("\n==================");
        // Вывести все элементы массива циклом for-each
        int[] array = {10, 20, 30, 40, 50};

        for (int element : array) {
            System.out.println(element);
        }




























    }
}
