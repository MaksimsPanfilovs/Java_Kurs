package homeworks.homework_27.computer;

public class Computer {

    public static int counter = 1;
    private final int id;
    private String name;


    private Storage storage;
    private Memory memory;
    private Procesor procesor;

    public Computer(String name, Storage storage) {
        this.id = counter++;
        this.name = name;
        this.procesor = new Procesor("Intel", "i7");
        this.memory = new Memory("Radion", "STX435");
        this.storage = storage;
    }

    public String toString() {
        return String.format("Компьютер %s, с процессором: %s, опер. памятью: %s и ж. диском %s.",
                name, procesor, memory, storage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
