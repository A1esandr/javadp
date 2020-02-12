package example;

import example.cars.*;

public class App {

    private static final String RIDER = "Tom";

    public static void main(String[] args) {
        CarController bmw = new CarController(new BMWCar());
        CarController mercedes = new CarController(new MercedesCar());
        CarController volvo = new CarController(new VolvoCar());

        bmw.ride(RIDER);
        mercedes.ride(RIDER);
        volvo.ride(RIDER);
    }
}
