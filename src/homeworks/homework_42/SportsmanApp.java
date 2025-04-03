package homeworks.homework_42;

import java.util.Arrays;

/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).

Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.

Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.

В методе main создайте массив из нескольких объектов Sportsman.

Отсортируйте его с использованием:

естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */
public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmenArray = new Sportsman[6];
        sportsmenArray[0] = new Sportsman("John", 28, 100.5);
        sportsmenArray[1] = new Sportsman("Alex", 24, 90.75);
        sportsmenArray[2] = new Sportsman("Bob", 30, 100.5);
        sportsmenArray[3] = new Sportsman("Tom", 28, 50);
        sportsmenArray[4] = new Sportsman("Hanna", 25, 90.5);
        sportsmenArray[5] = new Sportsman("Zlatan", 25, 91);

        Arrays.sort(sportsmenArray);

        for (Sportsman sportsman : sportsmenArray) {
            System.out.println(sportsman);
        }
        System.out.println("====================\n");

        Arrays.sort(sportsmenArray, new SportsmanScoreComparator());
        for (Sportsman sportsman : sportsmenArray) {
            System.out.println(sportsman);
        }

        System.out.println((int) (90.5 - 90.75));
        System.out.println(Double.compare(90.50, 90.75));

        System.out.println("======================\n");

        Arrays.sort(sportsmenArray, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        for (Sportsman sportsman : sportsmenArray) {
            System.out.println(sportsman);
        }

    }

}
