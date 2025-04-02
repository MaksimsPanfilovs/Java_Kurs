package lessons.lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 4, 11, 0};

        // apple < banana
        // Zebra < apple
        // Apple < apple

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrary", 2025, 300);
        cars[5] = new Car("Ferrary", 2021, 250);

        printCar(cars);

        Arrays.sort(cars);

        // Есть интерфейс Comparable<T> (с английского можно перевести как "сравнимый")
        // Интерфейс Comparator<T>
        printCar(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);
        printCar(cars);

        System.out.println("=============\n");

        Arrays.sort(cars, new CarModelComparator());

        printCar(cars);

        System.out.println("==============================\n");

        // Анонимные классы - это класс, для создания объекта на лету - без явного объявления нового класса.
        // Используются когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        printCar(cars);

        // Отсортировать машины по году выпуска в обратном порядке.
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 4, 1, 10
            // -> 1, 4, 10
            // -> 10, 4, 1
            // a vs b -> a - b -> b - a
            // 4 vs 10 -> 10 - 4 -> (b - a) -
            public int compare(Car car1, Car car2) {
                return car2.getYear() - car1.getYear();
            }
        });
        printCar(cars);

        // Сравнить машины по году выпуска в порядке возрастания
        // если год совпадает - тогда такие машины сравнить по модели в порядке убывания.
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear() - car2.getYear();

                if (yearCompare != 0) {
                    return yearCompare;
                }

                // годы машин равны (yearCompare = 0)
                // обратный порядок по модели
                return car2.getModel().compareTo(car1.getModel());
            }
        });
        printCar(cars);

        // Функциональный интерфейс - это интерфейс, который имеет ровно один абстрактный метод (метод который нужно реализовать).
        // Интерфейс Comparator -  Функциональный интерфейс.

        /*
        Лямда-выражения это краткий способ реализации анонимных функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов.

        (parameters) -> expression
        или
        (parameters) -> {statements;}

        Лямда-выражения во многих случаях могут заменить анонимные классы.
        реализовать на лету функциональные интерфейсы.
         */

        // По году в обратном порядке с использованием лямда-выражения.
        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });

        printCar(cars);

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());

        // Отсортировать машины по максимальной скорости в порядке убывания.
        // Если скорость совпадет - отсортировать по году - естественный порядок (от младшей к старшему).

        Comparator<Car> carComparator = (car1, car2) -> {
//            System.out.println(car1.getMaxSpeed() + " | " + car2.getMaxSpeed());
//            int speedCompare = car1.getMaxSpeed() - car2.getYear();

            // Чтобы защитится от переполнения типов.
            int speedCompare = Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed());
//            System.out.println("car1 - car2: " + speedCompare);

            if (speedCompare == 0) {
//                return car1.getYear() - car2.getYear();
                return Integer.compare(car1.getYear(), car2.getYear());
            }

            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCar(cars);

        // Comparator - имеет набор статически и дефолтных методов,
        // облегчающих написание сложных / составных компараторов.

        // Comparing - позволяет сортировать объекты по ключу
        // Функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнивать два объекта.
         /*
        car -> car.getYear()
        Car::getModel
         */

        // Отсортировать машины по модели в естественном порядке.
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);

        printCar(cars);

        // Ссылка на метод - это сокращенная запись лямбды
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCar(cars);

        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки.
        // comparingInt, comparingLong, comparingDouble
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));
        printCar(cars);

         /*
        Второй параметр метода comparing

        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder() - - определяет обратный порядок сортировки
        Comparator.nullsFirst - значения null будут признаны как наименьшие (т.е. Располагаться слева)
        Comparator.comparing(класс::метод).thenComparing(класс::другойМетод) - Это выражение создаёт компаратор,
        который сначала сравнивает объекты по результату метода метод. Если объекты равны (то есть сравнение возвращает 0),
        то сравнение производится по другому ключу (который вернет другойМетод)
        .reversed()
         */


        // Отсортировать по году выпуска в порядке убывания
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCar(cars);

//        cars[5] = new Car(null, 2021, 250);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.naturalOrder())));

        printCar(cars);
        System.out.println("===================================\n");

        // Отсортировать по модели. Если модели равны, то отсортировать по убыванию года выпуска.

        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCar(cars);

        // Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке.

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCar(cars);

        // Отсортировать машины по году выпуска в обратном порядке, если год равен - отсортировать по максимальной скорости.

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getMaxSpeed));
        printCar(cars);


    }

    public static void printCar(Car[] cars) {
        System.out.println("===============================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("===============================");
    }


}
