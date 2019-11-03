package Lesson09_Enum;

import java.util.Scanner;

public class Lesson09Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int number1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int number2 = scan.nextInt();

        System.out.println("Number1 + number 2 = " + (number1 + number2));
    }
}