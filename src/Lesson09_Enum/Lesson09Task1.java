package Lesson09_Enum;

import Lesson09_Enum.Task1.Months;
import Lesson09_Enum.Task1.Seasons;

import java.util.Scanner;

public class Lesson09Task1 {
    public static void main(String[] args) {
        System.out.println("1. Check the month");
        System.out.println("2. Month of the season");
        System.out.println("3. The same number of days");
        System.out.println("4. Less days have such months");
        System.out.println("5. More days have such months");
        System.out.println("6. Next season");
        System.out.println("7. Previous season");
        System.out.println("8. Even number of days");
        System.out.println("9. Odd number of days");
        System.out.println("10. Month has four days");
        System.out.print("Enter number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.print("Enter month: ");
        scan = new Scanner(System.in);

        String in = scan.nextLine().toUpperCase();

        System.out.println("Entered value: " + in);

        switch (number) {
            case 1:
                boolean exist = false;

                for (Months month : Months.values()) {
                    if (month.name().equals(in)) {
                        exist = true;
                        break;
                    }
                }

                if (exist) {
                    System.out.println("Exist");
                } else {
                    System.out.println("Not Exist");
                }

//                if (Months.monthExist(in)) {
//                    System.out.println("Exist");
//                } else {
//                    System.out.println("Not Exist");
//                }
                break;
            case 2:
                Seasons season = Seasons.WINTER;
                if (season == Seasons.SPRING) season = Seasons.SUMMER;
                System.out.println(season);

        }
    }
}