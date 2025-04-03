package consultations.cons_12;

import lessons.lesson_28.animals.Animals;
import lessons.lesson_28.animals.Cat;
import lessons.lesson_28.animals.Dog;
import lessons.lesson_28.animals.Hamster;

/*
Объекты могут принадлежать классу X и при этом могут быть приведены
к другому типу, если между классами есть связь наследования.
Это называется кастингом (casting).

Кастинг бывает двух видов:

- Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
- Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса.


 */
public class CastingExample {

    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование

        // Восходящее образование происходит автоматически.

        Animals animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        !!! Важно!
        Тип ссылочной переменной определяет:
        1. Ссылки на объекты каких типов могут храниться в этой переменной
        2. Список методов, которые можно вызвать, обращаясь к этой переменной
         */

        // Ссылочная может хранить объект своего класса или любого ребенка.

        // Какая реализация будет вызвана - определяется типом объекта
        animal.voice();

        Animals animal1 = new Hamster(); // Неявное автоматическое преобразование Hamster к типу Animal

        // Сейчас объект Hamster
        animal1.voice();

        System.out.println("\n=============");

        Animals[] animals = new Animals[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }


        // Todo Нисходящее преобразование

        Animals animalLink = new Cat();
        Cat catLink;

        Animals animalDog = new Dog();

        if (animalLink instanceof Cat) {
            catLink = (Cat) animal;
            catLink.eat();
        }

        catLink = (Cat) animalLink;
        catLink.eat();


        if (animalDog instanceof Cat) {
            catLink = (Cat) animalDog;
            catLink.eat();
        } else {
            System.out.println("Этот объект нельзя привести к коту");
        }

//        int x = 10;
//        double dVar = x;
//        x = (int) dVar;


    }

}
