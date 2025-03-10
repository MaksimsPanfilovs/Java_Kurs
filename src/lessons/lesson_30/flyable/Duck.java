package lessons.lesson_30.flyable;

// Множественная реализация интерфейсов
public class Duck implements Flyable, Swimmable {

    // Class B extends A, A extends C; != class B extends A, C;

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
