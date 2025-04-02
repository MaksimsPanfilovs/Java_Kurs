package homeworks.homework_42;
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
        sportsmenArray[0] = new Sportsman("Alex", 24, 90.75);
        sportsmenArray[0] = new Sportsman("John", 28, 100.5);
        sportsmenArray[0] = new Sportsman("John", 28, 100.5);
        sportsmenArray[0] = new Sportsman("John", 28, 100.5);
        sportsmenArray[0] = new Sportsman("John", 28, 100.5);

    }

}
