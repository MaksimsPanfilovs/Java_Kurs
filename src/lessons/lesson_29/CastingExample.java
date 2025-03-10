package lessons.lesson_29;

import lessons.lesson_28.animals.Animals;
import lessons.lesson_28.animals.Cat;
import lessons.lesson_28.animals.Dog;
import lessons.lesson_28.animals.Hamster;

/*
В Java объекты могут принадлежать классу Х и при этом могут быть приведены к другому типу,
если между классами есть связь наследования.
Это называется Кастингом (casting).

Кастинг бывает двух видов:

- Восходящие преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
- Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса.
 */
public class CastingExample {

    public static void main(String[] args) {


        // Восходящие и нисходящие преобразование

        // Восходящие преобразование происходит автоматически

        Animals animals = new Cat(); // тип Cat автоматически преобразуется к типу Animals

    /*
    !!! Важно!
    Тип ссылочной переменной определяет:
    1. Ссылки на объекты
    2. Список методов, которые можно вызвать, обращаясь к этой переменной
     */
        // Ссылочная может хранить объект своего класса или любого ребенка.

        // Какая реализация будет вызвана - определяется типом объекта
        animals.voice();

        Animals animals1 = new Hamster(); // Неявное автоматическое преобразование Hamster к типу Animal

        // Сейчас объект Hamster
        animals1.voice();

        System.out.println("\n=========================");

        Animals[] animal = new Animals[3];

        animal[0] = animals;
        animal[1] = animals1;
        animal[2] = new Dog();

        for (int i = 0; i < animal.length; i++) {
            animal[i].voice();
        }

        // Нисходящие преобразование

        int intX = 10;
        double doubleX = intX; // неявное автоматическое
        System.out.println(doubleX);

        intX = (int) doubleX; // явное перобразование


        Animals animalsD = new Dog(); // Upcasting - восходящие преобразование.

        Dog dog = (Dog) animalsD; // Downcasting - явное нисходящие преобразование

        dog.bark();

        Animals animalsCat = new Cat();
        // Если попытаться привести объект к неверному типу - будет ошибка компиляции -ClassCastException

//        Dog dog1 = (Dog) animalsCat;
//        dog1.bark();

        System.out.println("\n============1=============");
        for (int i = 0; i < animal.length; i++) {
            Animals currentAnimal = animal[i];
            currentAnimal.voice();
            // Можно проверить тип объекта для избежания ошибки перед Downcasting
            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке " + i + " is a Cat type");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // Специфический метод класса Cat
            }
            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark(); // Метод класса Dog
            }
            System.out.println("\n==========2===========");
        }


    }

}
