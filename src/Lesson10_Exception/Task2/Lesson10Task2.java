package Lesson10_Exception.Task2;

import java.util.Scanner;

public class Lesson10Task2 {
    public static void main(String[] args) throws IllegalAccessException, MyException {

        System.out.println("Enter number 1: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println("Enter number 2: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        }
        if (a == 0 && b != 0) {
            throw new ArithmeticException();
        }
        if (a != 0 && b == 0) {
            throw new ArithmeticException();
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        }
        if (a > 0 && b > 0) {
            throw new MyException();
        }
    }
}