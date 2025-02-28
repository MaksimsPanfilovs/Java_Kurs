package lessons.lesson_24;

public class CarApp {
    public static void main(String[] args) {

        Car bmw = new Car("BMW",200);
        System.out.println("static totalCars: " + Car.totalCars);

        System.out.println(bmw.toString());

        Car vw = new Car("VW",300);
        System.out.println(vw.toString());
        System.out.println("После создания 2-х: " + bmw.toString());

        System.out.println("static totalCars: " + Car.totalCars);

        // Я могу обратится к статике от имени конкретного объекта
        // Но это плохая практика. И так делать не рекомендуется
        //System.out.println("vw.totalCars: " + vw.totalCars);

        // Нам следует обращаться к статике от имени класса

        // Модификатор статик применим только к полям или методам класса
        //static int x;//





    }
}
