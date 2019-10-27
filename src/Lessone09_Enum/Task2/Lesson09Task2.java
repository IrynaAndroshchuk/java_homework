package Lessone09_Enum.Task2;


import java.util.Scanner;

public class Lesson09Task2 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number / 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}