package example.cars;

import example.Car;

public class BMWCar implements Car {
    @Override
    public void ride(String name) {
       System.out.println(name + " rides in BMW");
    };
}
