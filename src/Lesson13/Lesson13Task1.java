package Lesson13;

import Lesson08_SOLID.Random;
import Lesson13.Task1.Car;
import Lesson13.Task1.SortByReleaseYear;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson13Task1 {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        for (int i = 1; i < Random.randomInt(5, 20); i++) {
            cars.add(new Car(Random.randomInt(100, 1000), Random.randomInt(2000, 2019)));
        }

        for (Car car : cars) {
            System.out.println(car);
            car.setHorsepower(250);
        }

        cars.sort(new SortByReleaseYear());

        System.out.println();

        for (Car car : cars) {
            System.out.println(car);
        }

        Collections.reverse(cars);

        System.out.println();

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}