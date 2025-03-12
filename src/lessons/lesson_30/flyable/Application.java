package lessons.lesson_30.flyable;

public class Application {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        System.out.println("\n=================\n");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = airplane;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            // Проверяем возможность приведения ссылки к типу интерфейса
            if (flyable instanceof Swimmable) {
                System.out.println("Могу привести этот объект к Swimmable");
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
                System.out.println("\n============");
            }

            // Проверяем возможность приведение ссылки к типу класса
            if (flyable instanceof Airplane) {
                System.out.println("Могу привести к классу Airplane");
                Airplane airplanelink = (Airplane) flyable;
                System.out.println("вместимость: " + airplanelink.capacity);
                airplanelink.takePassenger();
                System.out.println("Кол-во пассажиров: " + airplanelink.amountPassengers);
            }
        }


        System.out.println("\n========================\n");

        Duck duck1 = new Duck();
//        duck1.test();
        // Если в двух интерфейсах есть одинаковый default метод, и если его реализовать
        // Получим ошибку компиляции, нужно переопределить метод в классе.





    }
}
