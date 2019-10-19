package lesson05;

import lesson05.Task2.Body;
import lesson05.Task2.Car;
import lesson05.Task2.Helm;
import lesson05.Task2.Wheel;

public class Lesson05Task2 {
    public static void main(String[] args) {
        Helm helm = new Helm(7);
        Wheel wheel = new Wheel(8);
        Body body = new Body("sedan");


        Car car = new Car("Green", helm, wheel, body);

        System.out.println(car);

        car.upgrade();

        System.out.println(car);

        car.getHelm();
    }
}