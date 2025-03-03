package lessons.lesson_25;

public class StaticBlockDemo {
    static int conter = 5;
    static String[] colors = new String[conter];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок иннициализации
    // В нем могут быть проинициализированы статические поля класса (присвоение начальных значения)
    // Вызывается ровно один раз в момент загрузки класса в JVM (до вызова конструктора)
    static {
        System.out.println("Static Block Run");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    static {
        System.out.println("Second Static!");
    }

    // НЕ статические блоки инициализации.
    // Выполняются при КАЖДОМ создании объекта
    // Вызывается до конструктора
    {
        System.out.println("NON-static block Run!!!");
        this.title = "Default";
        if (conter == 0) {
            this.capacity = 50;
        }
    }

    // Конструктор
    public StaticBlockDemo() {
        System.out.println("Constructor Run!");
//        if (conter == 0) {
//            this.capacity = 50;
//        }

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";
    }
    // Конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Constructor2 Run!");
//        if (conter == 0) {
//            this.capacity = 50;
//        }
        this.title = title;
    }

    public String toString() {
        return String.format("Title: %s, capacity: %d, static counter: %d",
                title, capacity, conter);
    }


}
