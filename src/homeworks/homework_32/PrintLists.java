package homeworks.homework_32;

import lists.MyList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList<U>, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
Пример использования:

MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
 */
public class PrintLists {

    public static <T, U> void printTwoLists(MyList<T> list1, MyList<U> list2) {
        // Вызову элементы 1-го списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // Вывожу элементы 2-го списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
