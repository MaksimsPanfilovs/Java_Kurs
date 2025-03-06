package lessons.lesson_28.animals;

public class Cat extends Animals {

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()
    @Override // Аннотация, указывает, что метод переопределяется родительский метод
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }
}
