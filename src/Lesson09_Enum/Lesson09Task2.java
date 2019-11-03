package Lesson09_Enum;


import java.util.Scanner;

public class Lesson09Task2 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());

        if (number != (int) number) {
            System.out.println("Your number is not integer");
            System.exit(0);
        }

        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}