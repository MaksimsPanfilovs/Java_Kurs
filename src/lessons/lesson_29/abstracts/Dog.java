package lessons.lesson_29.abstracts;
//
public abstract class Dog extends Animal {

    // Если потомок реализован НЕ все абстрактные методы родителя,
    // должен быть помечен как абстрактный

    @Override
    void move() {
        System.out.println("Dog move");
    }

}
