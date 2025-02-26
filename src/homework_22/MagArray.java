package homework_22;

public class MagArray {

    int[] array;
    int cursor;

    // Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    int lastIndexOf(int value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Удаление элемента по значению
    boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index >= 0 && index < cursor) {

            int val = array[index];

            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;

            return true;

        } else {
            return false;
        }
    }

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

}
