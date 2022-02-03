package Lessons.Lesson41.garage;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();

        Car car = new Car("Renault", 123);
        Bike bike = new Bike("BMW", 120);

        garage.add(car);
        garage.add(bike);

        System.out.println(garage.indexOf(bike));

        Car car1 = new Car("Mercedes", 340);
        garage.add(car1);

        Collections.sort(garage);
        System.out.println(garage);
    }
}
