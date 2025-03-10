package homework_21;

import com.sun.jdi.connect.Transport;

public class MainTransport {
    public static void main(String[] args) {

        homework_21.Transport21 car = new homework_21.Transport21("Car", 7, 0.5);
        homework_21.Transport21 truck = new homework_21.Transport21("Truck", 2, 12);
        homework_21.Transport21 train = new homework_21.Transport21("Train", 500, 1000);

        car.transInfo();
        truck.transInfo();
        train.transInfo();


    }
}
