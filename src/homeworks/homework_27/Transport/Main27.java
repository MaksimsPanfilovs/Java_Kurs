package homeworks.homework_27.Transport;

import homeworks.homework_27.computer.Computer;
import homeworks.homework_27.computer.Memory;
import homeworks.homework_27.computer.Storage;
import lessons.lesson_27.BusDriver;

public class Main27 {
    public static void main(String[] args) {

        Storage storage = new Storage("SATA", "HDD_256T");
        Computer computer = new Computer("Acer", storage);

        Memory memory = new Memory("dde, ", "jkhh");

        System.out.println(computer);

        BusDriver driver = new BusDriver("alex", "LC5253");
        Autobus27 bus = new Autobus27(driver, 15);
        System.out.println(bus.toString());

        Passenger pas1 = new Passenger("John");
        Passenger pas2 = new Passenger("Max");
        Passenger pas3 = new Passenger("Lisa");

    }
}
