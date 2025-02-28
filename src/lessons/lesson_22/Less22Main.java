package lesson_22;

import java.lang.reflect.Array;

public class Less22Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        // {1, 3, 66, 5, 4, 100}
        // add(100), remove(5) - {1, 3, 66, 4, 100}

        lesson_22.MagicArray magic = new lesson_22.MagicArray();

        System.out.println(magic.toString());

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6, 7, 8);
        magic.add(10, 20, 30);

        System.out.println("В массиве сейчас элементов : " + magic.size());


        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);


        magic.test();
        System.out.println("\n==========================\n");
        int value = magic.get(0);
        System.out.println("magic.get(0): " + value);

//        System.out.println("magic.get(15): " + magic.get(15));
//        System.out.println("magic.get(-1): " + magic.get(-1));
//        System.out.println("magic.get(30): " + magic.get(30));

        int oldValue = magic.remove(3);
        System.out.println("magic.remove(3): " + oldValue);
        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());
        magic.add(1000);
//        System.out.print("Внутрений массив: ");
//        magic.test();
//        System.out.println(magic.remove(-6));

        System.out.println("\n=========================\n");
        System.out.println("magic.indexOf(20): " + magic.indexOf(20));

        int index = magic.indexOf(20);
        if (index >= 0){
            System.out.println("Значение было найдено");
        }else {
            System.out.println("Вернулся отрицательный индекс. Такое значение отсутствует");
        }

        System.out.println(magic.toString());
        System.out.println("magic.lastIndexOf(20): " + magic.lastIndexOf(20));

        System.out.println("\n===========================\n");

        System.out.println("magic.removeByValue(8): " + magic.removeByValue(8));
        System.out.println(magic.toString());




    }
}
