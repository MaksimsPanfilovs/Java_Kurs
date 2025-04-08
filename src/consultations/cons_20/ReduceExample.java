package consultations.cons_20;

import java.util.Random;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    /*
    Аккумулирующие методы

    Эти методы используются для вычисления одного значение на основании данных потока (и некого начального значения)

    Optional<T> reduce(BinaryOperator<T> accumulator) - Выполняет свертку (аккумулирование) элементов потока.

    T reduce(T identity, BinaryOperator<T> accumulator) - Выполняет свертку (аккумулирование) элементов потока.

    BinaryOperator<T> - функциональный интерфейс, который является специальной формой BiFunction<T, T, T>
    Используется когда два объекта одного типа объединяются и возвращается объект того же типа

     */

    public static void main(String[] args) {

        task1();
//        task2();
//        task3();

        // Тернарный оператор - альтернатива операторы if с двумя ветками
        /*
        if (условие) {
            // true
        } else {
            else
        }
         */

        Random rand = new Random();

        String result; // положительное / отрицательное
        int x = rand.nextInt();
        System.out.println("x: " + x);

//        if (x >= 0) {
//            result = "положительное";
//        } else {
//            result = "отрицательное";
//        }

        // Тернарный оператор
        result = x >= 0 ? "положительное" : "отрицательное";
//        result = "положительное";
//        result = "отрицательное";

        System.out.println("result: " + result);


        System.out.println(ternary(x));

    }

    public static String ternary(int x) {
        return  x >= 0 ? "+" : "-";

//        if (x >= 0) {
//           return "положительное";
//        } else {
//            return "отрицательное";
//        }
    }

    private static void task3() {
        // Можно использовать для нахождения максимума. Происходить не накопление, а замена значения переменной
        List<String> strings = List.of("Java", "longestString", "Kotlin", "Python");
        Optional<String> longest = strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println(longest);

    }

    private static void task2() {
        List<String> strings = List.of("Java", "Kotlin", "Python");
        Optional<String> concat = strings.stream()
                // s1 = s1 + " " + s2
                .reduce((s1, s2) -> s1 + " " + s2);
        System.out.println(concat);

        String concat2 = strings.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println(concat2);
    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // посчитать сумму всех элементов, которые кратные трем

        // res - 0
        // 3, 6, 9, 12, 15
        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0)
                .peek(System.out::println)
                // i1 = i1 + i2
                .reduce((i1, i2) -> i1 + i2);

        System.out.println(sum);

        // res = 18
        // 3, 6, 9
        Integer sum2 = integers.stream()
                .filter(i -> i % 3 == 0)
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println("sum2: " + sum2);


    }
}
