package lessons.lesson_30.interfaces;
/*
Интерфейс содержит только поведение, которое
 */
public interface Printable {
    // Интерфейс - это совокупность абстрактных методов, задающих поведение.
    // Интерфейс - косвенно абстрактный. Ключевое слово abstract, присутствует по умолчанию в объявлении интерфейса.

    // В интерфейсе также могут быть константы (public static final)
    public static final String color = "black";

    // Все методы интерфейса косвенно (неявно и по умолчанию) и абстрактные, и публичные
    // public abstract
    void print();

    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    default void defaultMethod(){
        System.out.println("Default method");
    }

    // Начиная с JDK 8 доступны статические методы
    static void testStaticMethod(String str) {
        System.out.println("Static method: " + str);
    }

    // // Начиная с JDK 9 появились приватные методы (могут быть статическими и нестатическами.
    // Переопределить в классе НЕВОЗМОЖНО.


}
