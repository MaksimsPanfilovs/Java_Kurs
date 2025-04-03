package consultations.cons_11.dogs;

import java.util.Arrays;
import java.util.Random;

/*
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до   -> 0..50 +30
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке

 */
public class DogsApp {

    public static void main(String[] args) {
        Random rand = new Random();

        Dog[] dogs = new Dog[5];

        for (int i = 0; i < 5; i++) {
            int jump = rand.nextInt(51) + 30;
            dogs[i] = new Dog("Dog_" + (i + 1), jump);
        }

        System.out.println(Arrays.toString(dogs));

        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = rand.nextInt(101) + 70;
        }

        System.out.println("барьеры: " + Arrays.toString(barriers));

        int[] result = new int[dogs.length];

        for (int i = 0; i < dogs.length; i++) {
            Dog currentDog = dogs[i];

            System.out.println(currentDog.toString() + " стартует!");

            int count = 0;
            for (int j = 0; j < barriers.length; j++) {
                int currentBarrier = barriers[j];
                if (currentDog.jumpBarrier(currentBarrier)) {
                    count++;
                }
            }

            result[i] = count;
            System.out.println("Собака: " +  currentDog.getName() + " преодолела барьера: " + count);
            System.out.println("========================== \n");
        }

        System.out.println("Результаты: " + Arrays.toString(result));

        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].toString() + " -> ");
            System.out.println("Ее результат: " + result[i]);
        }


    }


}
