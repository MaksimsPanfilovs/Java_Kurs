package lessons.lesson_47;

/*
Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле.

Основная идея - преобразование последовательности элементов через набор операций.

Stream (поток) - поток данных представляет собой последовательность элементов.
Поток дает возможность поочередного получения элементов для обработки.
Стримы могут быть созданы из различных источников (коллекции, массивы, файлы, консоль и т.д.).

Pipeline - последовательность операций, выполняемых на потоке данных.

Промежуточные операции (Intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток).
Их может быть много (больше чем одна).

Терминальные операции / методы - это операции, которые запускают обработку потока и закрывает его.
После выполнения терминальной операции поток перестает быть доступным для дальнейших операций.
Может быть ТОЛЬКО ОДИН терминальный метод.

Ленивость вычисления
Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.

 */


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    /*
    Промежуточные методы (ВСЕ возвращают поток):
    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернет true.
    Т.е. оставляет элементы, удовлетворяющие условию. (Отбрасывает элементы НЕ удовлетворяющие условию).
    sorted() - сортирует поток в естественном порядке.
    sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора.

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных.

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока,
    Действие, как правило, не изменяющее элемент.

    distinct() - удаляет дубликаты из потока. Сравнивание (определение равенства) методом equals().

    -------------

    Терминальные методы:

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных.

    void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока.

     */
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
        task10();


    }

    private static void task10() {
        // Удалить дубликаты (повторяющиеся значения) из списка.
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("======================\n");
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);
        cats.forEach(System.out::println);

        System.out.println("============ Filter =============\n");
        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9() {
        // создание стрима из Map

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, cat2, cat3};
        // Получить список котов, имя которых длиннее 4 символов.
        // Arrays.stream(cats)- создает поток из элементов массива.
        List<Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставить в потоке только не null.
//                .filter(c -> Objects.nonNull(c)) // оставить в потоке только не null.
                .filter(Objects::nonNull) // оставить в потоке только не null.
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());
        /*
        Objects.nonNull(null) - вернет true, если параметр НЕ null.
        Objects.isNull(null) вернет true, если параметр null
         */
        System.out.println(longCats);

    }

    private static void task7() {
        List<Cat> cats = getListCat();
        // Вывести на экран имена котов, чей вес меньше 5.
        // Вывести на экран котов, оставшихся в потоке после фильтрации.

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(Cat::getName);
        /*
        peek - промежуточный метод. Используется в основном для отладки
        foreach
         */
        catStream.forEach(name -> System.out.println("Terminal: " + name));
    }

    private static void task6() {
        List<Cat> cats = getListCat();
        // Получить список имен кошек, у которых имена короче 5 символов.
        /*
        Классический - методы фильтрации должны выполнятся в потоке как можно раньше,
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        /*
        Читаемость, понимание кода
         */
        System.out.println("\n================");
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);
    }

    private static void task5() {
        List<Cat> cats = getListCat();
        /*
        Получить список имен кошек, чей вес больше 4
        Создать поток кошек.
        Оставить кошек, чей вес болбше 4.
        Изменить тип потока - Cat -> String (name).
        Собрать это в список.
         */
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("FatCatNames: " + catNames);
    }

    private static void task4() {
        List<Cat> cats = getListCat();

        // Получить список имен всех кошек.
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("CatNames: " + catNames);

        // Изначальная коллекция (источник данных для потока) не изменяется.

//        List<String> listNames = new ArrayList<>();
//        for (Cat cat : cats) {
//            listNames.add(cat.getName());
//        }

    }

    private static void task3() {
        List<Cat> cats = getListCat();

        // Оставить котов с именем, длиннее 4 символов.

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);
        // Пока не запущен терминальный метод - промежуточные операции не выполняются.
        List<Cat> catList = catStream.collect(Collectors.toList());
        System.out.println("LongCatName: " + catList);
    }

    private static List<Cat> getListCat() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task2() {
        List<Cat> cats = getListCat();

        // Список кошек с весом больше 4.
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println("FatCats: " + fatCats);

        // Повторно использовать "закрытый" поток нельзя.
        List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка (исключение).
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);

        // Получить список, содержащий все положительные числа из исходного списка.
        // Список должен быть отсортирован в порядке возрастания.

        List<Integer> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("Result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List.
                .filter(e -> e > 0) // фильтрация элементов потока.
                .sorted() // сортировка элементов в естественном порядке.
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List.

        System.out.println("List: " + integerList);

    }
}
