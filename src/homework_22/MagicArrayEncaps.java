package homework_22;

import java.util.Arrays;

public class MagicArrayEncaps {
    int[] array;
    int cursor;

    // Методы, расширяющие функционал массива

    public MagicArrayEncaps() {
        this.array = new int[10]; // [0, 0...0]
    }

    public MagicArrayEncaps(int[] array) {

        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            // (int...numbers) может принять ссылку на массив int[]
            add(array);
        }
    }

    // Добавление в массив одного элемента
    void add(int value) {

        // Нам нужна проверка! Есть ли свободное место во внутреннем массиве
        // Если нет места, нужно добавить место

        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем внутрений массив! Курсор = " + cursor);
        /*
        1. Создать новый массив большего размера (в 2 раза больше)
        2. Переписать значения из старого массива в новый (до курсора)
        3. Перебросить ссылку
         */
        // Shift + Alt + стрелки вверх / вниз | Mac: Shift + Opt + Стрелка

        // 1
        int[] newArray = new int[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    // Добавление в массив нескольких элементов
    void add(int... numbers) {
        // с numbers я могу обращаться точно такие, как со ссылкой на массив int
//        System.out.println("Принял несколько int:" + numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("У каждого инта есть индекс, как в массиве:" + numbers[0]);

        // Перебираю все значения. Для каждого вызываю метод add()
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Возвращает строковое представление массива
    // [5, 20, 45]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    // Текущее кол-во элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблеммой
        // Код, если индекс не корректный
        // Хорошего решения нет
        return -2_147_483_647;
        // Todo Поправить обработку некорректного индекса
    }

    // Удалить элемент по индексу. Вернуть старое значение.
    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к.кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значением из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            // Todo поправить возвращаемое значение
            return -2_147_483_647;
        }
    }

    //Поиск по значению
    // {1, 100, 5, 24, 0} -> indexOf(5) = 2; indexOf(50) = -1
    int indexOf(int value) {
        // Перебираю все значимые элементы
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если перебрал все элементы - не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }
        // Сюда мы попадаем, если ни одно значение в массиве не совпало
        return -1;
    }

    // Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }

        return -1;
        /*
        int index = -1;
        for (int i = 0; i < cursor; i++) {
            if(array[i] = value) {
            // Значения совпали, обновляю переменную index
                index = i;
            }
        }
        return index;
         */
    }

    // Удаление элемента по значению
    boolean removeByValue(int value) {
        /*
        1. Есть ли элемент с  таким значением - indexOf
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

    public int[] toArray() {
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }


    void test() {
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
12. Написать метод
 */
