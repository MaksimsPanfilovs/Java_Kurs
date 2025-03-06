package lessons.lesson_28.animals;

public class Hamster extends Animals {

    // Ничего не переопределяю - получаем реализацию всех родительских методов.


    // Переопределение метода родителя (Animals)
    @Override
    public String toString() {
        return "Hamster!";
    }
}
