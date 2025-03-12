package lessons.lesson_31.generics;
// Дженерики  работают только с объектами, т.е. только со ссылочными типами данных.
    // НЕ работает с примитивными типами

// Мы создаём универсальный класс. И не указываем тип данных, с которым он работает.
  //Мы хотим определять тип данных при создании объекта.

public class GenericBox <T> { // символ заполнитель T - type, E - element, K, V - key, value.
    // <T> - означает, что вместо T при создании объекта будет подставлен конкретный тип данных

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
