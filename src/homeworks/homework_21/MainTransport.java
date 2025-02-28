package homework_21;

public class MainTransport {
    public static void main(String[] args) {

        Transport car = new Transport("Car", 7, 0.5);
        Transport truck = new Transport("Truck", 2, 12);
        Transport train = new Transport("Train", 500, 1000);

        car.transInfo();
        truck.transInfo();
        train.transInfo();


    }
}
