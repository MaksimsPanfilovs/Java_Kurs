package lessons.lesson_25;

// Ключивое слово final. Оно может применятся к классам, членам классов (полям методам), переменным (в том числе к аргументам методов)
public class FinalDemo {

    // Для примитивных типов данных, помеченых как final
    // После инициализации (присвоения первого значения) - изменить значение в переменной нельзя
    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект).
    // Состояние объекта, который привязан, я могу изменить
    private final int[] ints = new int[5]; // [0, 0, 0, 0, 0]

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // Нельзя поменять значение final переменной.
        // this.capacity++;

        // Нельзя присвоить ссылку на другой объект или null
        //this.ints = new int[2];

        // но можно изменить состояние
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }

    // Параметры методы тоже можно пометить как final
    // Внутри метода невозможно изменить значение переменной
    public void finalArguments(final int x, final int[] array) {
        // x++;

        // не могу присвоить ссылку на новый объект
        // array = new int[10];

        // Могу изменять состояние объекта
        array[0] = x;
        array[1] = 1000;
    }

    // Сеттеры для финальных полей не генерируются
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }


}
