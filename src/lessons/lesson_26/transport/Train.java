package lessons.lesson_26.transport;
// Train is-a Bus -> НЕ верно. Наследовать не имею права
public class Train extends Vehicle {

    private int capacity;
    private int countPassengers;

    private int countWagon;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagon, int wagonCapacity) {
        super(model, year);
        this.wagonCapacity = wagonCapacity;
        this.countWagon = countWagon;
        // определить вместимость - посчитать capacity
        calculateCapacity();

    }

    private void calculateCapacity() {
        this.capacity = countWagon * wagonCapacity;

    }

    public void setCountWagon(int countWagon) {
        this.countWagon = countWagon;
        calculateCapacity();
        // TODO
        // Проконтролировать, что кол-во пассажиров не превышает новую вместимость
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagon() {
        return countWagon;
    }


    public int getWagonCahacity() {
        return wagonCapacity;
    }
}
