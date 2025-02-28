package lessons.lesson_24;

public class Car {

    // Статическое поле класса. Существует в единственном экземпляре. Доступна всем объектам в классе
    static int totalCars;

    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        totalCars++; // При создании нового объекта увеличиваем общее кол-во созданных автомобилей
    }

    public String toString() {
        return String.format("model: %s, power: %d. Всего создано машин: %d."
                ,model, power, totalCars);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
