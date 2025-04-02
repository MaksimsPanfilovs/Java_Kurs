package lessons.lesson_37.enums;

public class TraficsLight {

    private String serialNumber;
    private String location;

    // Red, Yellow, Green
    private Colors light;

    public TraficsLight(String serialNumber, String location, Colors light) {
        this.serialNumber = serialNumber;
        this.location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TraficsLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", location='" + location + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
