package lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int cursor;

    // Методы, расширяющие функционал массива

    @SuppressWarnings("unchecked")  // Подавляю предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        // Стирание типов. Невозможно создать объект типа T
        this.array = (T[]) new Object[10]; // [0, 0...0]
    }
    @SuppressWarnings("unchecked")
    public MyArrayList(T[] array) {

        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            // (int...numbers) может принять ссылку на массив int[]
            addAll(array);
        }
    }

    // Добавление в массив одного элемента.
    @Override
    public void add(T value) {

        // Нам нужна проверка! Есть ли свободное место во внутреннем массиве
        // Если нет места, нужно добавить место

        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива.
    @SuppressWarnings("unchecked")
    private void expandArray() {
        System.out.println("Расширяем внутрений массив! Курсор = " + cursor);
        /*
        1. Создать новый массив большего размера (в 2 раза больше)
        2. Переписать значения из старого массива в новый (до курсора)
        3. Перебросить ссылку
         */
        // Shift + Alt + стрелки вверх / вниз | Mac: Shift + Opt + Стрелка

        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    // Добавление в массив нескольких элементов.
    @Override
    public void addAll(T... value) {
        // с value я могу обращаться точно такие, как со ссылкой на массив int
//        System.out.println("Принял несколько int:" + value.length);
//        System.out.println(Arrays.toString(value));
//        System.out.println("У каждого инта есть индекс, как в массиве:" + value[0]);

        // Перебираю все значения. Для каждого вызываю метод add()
        for (int i = 0; i < value.length; i++) {
            add(value[i]);
        }
    }

    // Возвращает строковое представление массива.
    // [5, 20, 45]
    @Override
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    // Текущее кол-во элементов в массиве.
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу.
    public T get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }

    // Удалить элемент по индексу. Вернуть старое значение.
    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к.кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значением из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            return null;
        }
    }

    // Является ли коллекция пустой
    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    // Содержит ли массив элемент с таким значением.
    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    // Перезаписывает значение по указанному индексу.
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            // Если индекс корректный присваиваем новое значение.
            array[index] = value;
        }
        // Если нет - действий не требуется.
    }

    //Поиск по значению
    // {1, 100, 5, 24, 0} -> indexOf(5) = 2; indexOf(50) = -1
    public int indexOf(T value) {
        // Перебираю все значимые элементы
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если перебрал все элементы - не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {
            // null безопасное сравнение
            if (Objects.equals(array[i] , value)) {
//            if (array[i].equals(value))
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }
        // Сюда мы попадаем, если ни одно значение в массиве не совпало
        return -1;
    }

    // Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    public int lastIndexOf(T value) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (Objects.equals(array[i], value)) return i;
//            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    // Удаление элемента по значению
    @Override
    public boolean remove(T value) {
        /*
        1. Есть ли элемент с таким значением - indexOf
        2. Если элемента нет - ничего не пытаемся удалить - возвращаем false
        3. Если найден - удалить и затем вернуть true.
         */
        int index = indexOf(value);
        if (index < 0) return false;

        // В эту строчку кода попадём, только при index = 0 или больше
        remove(index);
        return true;

    }

    //  // {1, 100, 5, 100, 24, 0, 100}
//    int[] findAllValues(int value) {
//       // {1, 3, 6}
//        return null;
//    }

    // Написать метод, который вернет массив, состоящий из элементов магического массива
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        /*
        1. Создать массив размерностью cursor (кол-во значимых элементов)
        2. Пройтись по внутренуему массиву и скопировать все элементы в новый
        3. Вернуть ссылку на новый массив
         */

        if (cursor == 0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

        T[] result = (T[]) Array.newInstance(clazz, cursor);
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    // Не возможно вернуть объект типа интерфейс.
    // Если тип возвращаемого значения (или параметр метода) имеет тип "Интерфейс".
    // это значит, что я должен вернуть объект, который имплементировал этот интерфейс.
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            return array[currentIndex++]; // в одну строку.
//            T value = array[currentIndex];
//            currentIndex ++;
//            return value;
        }
    } // End class MyIterator

    public void test() {
        System.out.println(Arrays.toString(array));
    }
}

/*
1. Добавлять в массив элемент (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера внутреннего массива ++
3. Возвратить строковое представление массива (все элементы массива в одной строке) (какие элементы есть) ++
4. Добавить в массив сразу несколько значений ++
5. Текущее кол-во элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удалить элемент по индексу (есть индекс - удалить элемент из массива). Вернуть старое значение.
8. Удаление элемента по значению. Возвращал boolean. Если удалил - вернет true. Не нашел что удалять - false
9. Поиск по значению. Возвращать индекс первого вхождения элемента ++
10. Индекс последнего вхождения.
11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива
12. Написать метод, который вернет массив, состоящий из элементов магического массива
 */
