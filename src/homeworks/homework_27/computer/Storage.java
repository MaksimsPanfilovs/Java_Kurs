package homeworks.homework_27.computer;

public class Storage extends Component {

    public static int counter = 1;
    private final int id;

    public Storage(String brand, String model) {
        super(brand, model);
        this.id = counter++;
    }

    public int getId() {
        return id;
    }
}
