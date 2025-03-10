package lessons.lesson_28.animals;

public class Dog extends Animals {

    @Override
    public void voice() {
        // обращение к объекту родителя и вызов его реализации метода voice
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + "| Dog. Дополнение реализации родительского метода.";
    }
    public void bark() {
        System.out.println("Dog bark!");
    }
}
