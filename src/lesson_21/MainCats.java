package lesson_21;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создание нового объекта класса Cat
        // 1. Физически в памяти создаётся объект типа Cat
        // 2. Вызывается конструктор класса
        //    для инициализации свойств объекта (заполнение полей значениями)

        /*
        При создании объекта класса все его поля инициализируются какими-то значениями
        По умолчанию (если не задано другое поведение)
        поля инициализируются значениями по умолчанию для своего типа данных
        для чисел примитива -> 0 / 0.0
        boolean -> false
        для всех ссылочных (в том числе String -> null)
         */

        cat.sayMeow();
        cat.sleep();
        cat.run();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        System.out.println("Возраст: " + cat.age);

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект типа Cat
        // Имя (строка) которая была передана в конструктор будет
        // присвоено свойству name объекта класса

        System.out.println("cat1.name: " + cat1.name);
        System.out.println("cat1.color: " + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();


        System.out.println("\n========================\n");

        Cat cat2 = new Cat("Diamond", "red");

        cat2.whoAmI();

        Cat barsik = new Cat("Barsik","white", 2);

        System.out.println("barsik.name: " + barsik.name);
        System.out.println("barsik.color: " + barsik.color);
        System.out.println("barsik.age: " + barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;

        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("\nbarsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("\n=========================");

        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // null - ничто. Ссылка не ссылается ни на какой объект
        // Если у переменной, значение которой null попытаться вызвать метод, получить свойство -
        catClone.whoAmI();
    }
}
