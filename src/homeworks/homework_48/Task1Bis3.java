package homeworks.homework_48;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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
public class Task1Bis3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(9, 17, 18, 33, 22, 4, 101, 203, 1005, 100001);
//        task1(integers);
        task2(List.of("String", "Hello", "Java", "World", "LongString"));
        System.out.println("=======================\n");
        task2(List.of());

        task3(integers);

    }

    private static List<Integer> task3(List<Integer> integers) {
        return integers.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());

    }

    private static void task2(List<String> strings) {
        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));
        if (optionalString.isPresent()) {
            System.out.println("Min length string: " + optionalString.get());
        }else {
            System.out.println("Строк в списке не найдено!");
        }
//        strings.stream()
//                .filter(Objects::nonNull)


        // Методы Optional
        // ifPresent(Consumer<T> ) - если в Optional что-то есть - выполняется переданное действие.
        // ifPresentOrElse() - если значение есть, выполняется первое действие (дадут значения).
        // Если пусто - выполняется второе действие.
        optionalString.ifPresent(string -> System.out.println("ifPresent: " + string));

        optionalString.ifPresentOrElse(
                string -> System.out.println("Нашли: " + string),
                () -> System.out.println("Ничего не нашли")
        );


    }

    private static void task1(List<Integer> integers) {
        integers.stream()
                .filter(i -> i > 10)
//                .sorted(Comparator.comparing(i -> i % 10))
//                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }
}
