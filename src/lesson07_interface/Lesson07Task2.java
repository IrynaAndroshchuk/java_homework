package lesson07_interface;

import lesson07_interface.Task1.FixedSalaryEmployee;
import lesson07_interface.Task1.HourlySalaryEmployee;
import lesson07_interface.Task2.MyCalculator;

public class Lesson07Task2 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.println(myCalculator.plus(2, 4));
        System.out.println(myCalculator.minus(2, 4));
        System.out.println(myCalculator.multiply(2, 4));
        System.out.println(myCalculator.divide(2, 4));

    }
}