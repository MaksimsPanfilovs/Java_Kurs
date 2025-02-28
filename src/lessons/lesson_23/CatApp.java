package lesson_23;

public class CatApp {
    public static void main(String[] args) {

        lesson_23.Cat cat = new lesson_23.Cat("Catty", 8, 5);
        cat.sayMeow();

        System.out.println(cat.toString());

        //System.out.println(cat.age);
        // Не доступны т.к. помечены как private
        //cat.age = - 1000;
        //cat.weight = 1500;
        //cat.name = null;

        System.out.println(cat.toString());

        lesson_23.Cat cat2 = new lesson_23.Cat(null,150,240);
        System.out.println(cat2.toString());

        //cat2.testMethod(); // Метод не доступен т.к. помечен private

        System.out.println("\n=====================\n");

        int catAge = cat.getAge();
        System.out.println("В следуещем году коту будет: " + (catAge + 1));
        System.out.println("Вес: " + cat.getWeight());
        System.out.println("Имя котика: " + cat.getName());

        cat.setAge(15);
        cat.setAge(-10);
        cat.setWeight(15);
        cat.setWeight(100);
        cat.setWeight(-5);
        //   cat.setName("Max"); // сеттера в классе нет. Имя поменять нельзя.

        System.out.println(cat.toString());

        System.out.println("\n==============\n");
        cat.isProtected = true;
        System.out.println("cat.isProtected: " + cat.isProtected);
        cat.isDefault = false;
        System.out.println("cat.isDefault: " + cat.isDefault);



    }
}
