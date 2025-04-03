package consultations.cons_11.animals;

public class AnimalApp {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        dog.eat(); // унаследован от Animal
        System.out.println(dog.getName());
        System.out.println(dog.toString());

        System.out.println("\n=============");

        dog.bark(); // метод класса Dog

        Cat cat = new Cat("Catty");

//        cat.setName("Мурка"); // получен в наследство от Animal
        System.out.println(cat.toString());
        cat.eat();
    }
}
