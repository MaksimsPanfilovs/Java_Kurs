package homeworks.homework_25;
/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.

Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutablePoint {

    public static final int MAX_USERS = 100;

    private final int x;
    private final int y;
    private int a;


    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    MAX_USER = x; // не возможно изменить значение константы


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public void setX(int x) {
//        this.x = x;
//        // нельзя поменять значение у переменной помеченной как final
//        // можно только получить или использовать
//    }

    public void setA(int a) {
        this.a = a;
    }
}
