package homeworks.homework_27;

import lessons.lesson_27.AutoPilot;
import lessons.lesson_27.BusDriver;
import lessons.lesson_27.Passenger;

/*
Task 3 * (Опционально)
Переписать метод public String toString()в классе Autobus, используя StringBuilder для формирования строки.
 */
public class Autobus27 {

    private static int counter = 1;

    // Уникальный модификатор объекта
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь)
    private AutoPilot autoPilot; // композиция (жесткая связь)


    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus27(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autoPilot = new AutoPilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus: " + id).append(", " + driver);
        sb.append(", autopilot: " + autoPilot).append(", capacity: " + capacity);
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "Autobus{" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autoPilot=" + autoPilot.toString() +
//                ", capacity=" + capacity +
//                '}';
//    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers -1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*
        1. Надо проверить свободное место
        2. Находится ли уже этот пассажир в автобусе
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров
            3.3. Возвращаем true
        4. Иначе (3.3) - что-то пошло не так - выдаем сообщение об ошибке и возвращаем false.
         */

        if (countPassengers < capacity) {
            // Место есть
            // Надо проверить п.2.
            if (isPassengerInBus(passenger) >= 0) {
                // метод вернул 0 или больше, значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        // Свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;
    }

    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return i;
            }
        }
        // пассажира с таким id нет в массиве пассажиров
        return -1;
    }

    public boolean dropPassenger(Passenger passenger) {
        /*
        1. Убедится, что пассажир в автобусе
        2. Удалить его из массива
            2.1. Сдвинуть всех пассажиров "справа" от него
            2.2. Не забыть изменить кол-во пассажиров
            2.3. Вернуть true
         */

        if (passenger == null || countPassengers == 0) return false;

        int index = isPassengerInBus(passenger);

        if (index == -1) {
            // такого пассажира в автобусе нет
            System.out.printf("Пассажир с id %d в автобусе (%d) не найден!\n", passenger.getId(), this.id);
            return false;
        }
        // Удаление пассажира из списка
        for (int i = index; i < countPassengers - 1; i++) {
            passengers[i] = passengers[i + 1];
        }

        // необязательная строка
        passengers[countPassengers -1] = null;
        //обязательная строка
        countPassengers--;
        System.out.printf("Пассажир с id %d вышел из автобуса (%d)\n", passenger.getId(), this.id);
        return true;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setDriver(BusDriver driver) {
//        this.driver.setAutobus(null);
        this.driver = driver;
//        this.driver.setAutobus(this);
    }
}
