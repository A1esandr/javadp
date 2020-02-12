package example.cars;

import example.Car;

public class VolvoCar implements Car {
    @Override
    public void ride(String name) {
        System.out.println(name + " rides in Volvo");
    };
}
