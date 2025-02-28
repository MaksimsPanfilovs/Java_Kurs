package lesson_11;

public class Variables {
    public static void main(String[] args) {

     // Java - Строго типизированный язык программировария, а Python - динамически типизированный язык
     // Python: x = 10 # Python сам понимает / определяет тип переменной - число / строка

    /*
        Строгая типизация - Каждая переменная должна иметь определенный тип данных, который не может измениться.
        Тип данных определяет какие значения могут храниться в переменной и
        какие операции можно выполнить со значением этой переменной.


        Объявляя переменную мы должны указать тип данных и выбрать уникальное имя.

        Имена переменных ВСЕГДА пишутся с маленькой буквы и в camelCase нотации
        my first variable

    */
        int myFirstVariable; // Обявление (декларация) переменной типа int

        // Инициализация переменной - первое присвоение значения
        myFirstVariable = 1; // Присвоение значения

        System.out.println(myFirstVariable);

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        mySecondVariable = 50;

        System.out.println("mySecVar " + mySecondVariable);

        byte byteVar = 125; // Объявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        // Имя переменной должно быть уникально в границах видимости.
        // byte mySecondVariable; Я не могу повторно объявить переменную с таким же именем

        short shortVar; //  Объявление переменной типа short
        shortVar = 31000; // Инициализация переменной

        // знак _ для визуального разделения разрядов в числе
        long longVariable = 2_100_000_000_000_000_000L; // L в конце числа - сказать компиляторе, что это число в формате long
        System.out.println("longVariable: " + longVariable);

        // В коде любое целое число воспринимается компилятор как число в формате int

        double doubleVar = 10.5421; // Разделитель дробной части - точка
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 123.564f; // f/F - указать, что число в формате float
    }
}
