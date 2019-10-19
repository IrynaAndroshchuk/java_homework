package lesson05;

import lesson05.Task3.Animal;

public class Lesson05Task3 {
    public static void main(String[] args) {
        Animal animal = new Animal("lion", 80, 3);

        System.out.println("name = " + animal.getName() + ", " + "speed = " + animal.getSpeed() + ", " + "old = " + animal.getOld());

        animal.setName("kangaroo");
        animal.setSpeed(65);
        animal.setOld(2);
        System.out.println("name = " + animal.getName() + ", " + "speed = " + animal.getSpeed() + ", " + "old = " + animal.getOld());


    }

}