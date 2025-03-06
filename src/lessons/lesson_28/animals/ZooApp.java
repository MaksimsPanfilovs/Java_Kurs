package lessons.lesson_28.animals;

public class ZooApp {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice(); // унаследован от Animals
        System.out.println(cat.toString());

        cat.eat(); // метод класса Cat

        Dog dog = new Dog();
        dog.voice(); // Если в потомке не переопределяем метод,
        // будет вызвана реализация метода родителя.

        System.out.println(dog.toString());

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n==================");

        Object object = new Object();


    }
}
