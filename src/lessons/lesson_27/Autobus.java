package lessons.lesson_27;

import java.util.Arrays;

/*
Ассоциация - это связь, при которой один объект связан с другим объектом. Это наиболее общая форма связи.

Агрегация - это форма ассоциации, представляющее собой отношение "часть-целое",
где часть может существовать независимо от целого

Композиция - это более жесткая форма агрегации (также отношение "часть-целое"),
НО где часть не может существовать без целого.
Обычно, часть создаётся вместе с целым. Если целое уничтожается, часть также уничтожается. (жизненные циклы объекта).

Ассоциации (в том числе и Агрегация и Композиция) реализуются через создание ссылок в классе на другие объекты.
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Ассоциации - это отношение между двумя классами, где один класс использует другой класс в качестве

Автобус содержит Водителя. HAS-A Агрегация. Водитель может существовать отдельно от Автобуса

Автобус содержит Автопилот. HAS-A Композиция. Автопилот является неотемлемой частью Автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым.

Важные аспекты ассоциации.

Направленность. Ассоциация может быть однонаправленная или двунаправленная.

Кардинальность связи. Определяет сколько объектов одного класса может быть ассоциировано с объектами других классов

One-to-One (один к одному), one-to-many (один ко многим), many-to-many (многие ко многим)

1 : 1 -> Автобус и двигатель
Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус.

1 : Many -> Автобус и список пассажиров. Один автобус может иметь множество пассажиров. Один пассажир - в одном автобусе.

Many : Many -> Список автобусов и список автобусных остановок.
Каждый автобус останавливается на множестве остановок
На каждой остановке может обслуживаться множество автобусов

 */
public class Autobus {

    private static int counter = 1;

    // Уникальный модификатор объекта
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь)
    private AutoPilot autoPilot; // композиция (жесткая связь)


    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autoPilot = new AutoPilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autoPilot=" + autoPilot.toString() +
                ", capacity=" + capacity +
                '}';
    }

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
            if (isPassengerInBus(passenger)) {
                // метод вернул true, значит пассажир в автобусе
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

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return true;
            }
        }
        // пассажира с таким id нет в массиве пассажиров
        return false;
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
        this.driver = driver;
    }
}
