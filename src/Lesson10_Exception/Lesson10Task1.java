package Lesson10_Exception;

import Lesson09_Enum.Task1.Months;
import Lesson09_Enum.Task1.Seasons;
import Lesson10_Exception.Task1.WrongConsoleParametersException;

import java.util.Scanner;

public class Lesson10Task1 {

    /**
     * @param args
     * @throws WrongConsoleParametersException
     */
    public static void main(String[] args) throws WrongConsoleParametersException {
        while (true) {
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
            System.out.println("11. Exit");

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
                        throw new WrongConsoleParametersException("Not exist");
                    }

//                if (Months.monthExist(in)) {
//                    System.out.println("Exist");
//                } else {
//                    System.out.println("Not Exist");
//                }
                    break;
                case 2:
                    for (Months month : Months.values()) {
                        if (month.getSeason().name().equals(in)) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                case 3:
                    for (Months month : Months.values()) {
                        if (month.getDays() == Months.valueOf(in).getDays()) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                case 4:
                    for (Months month : Months.values()) {
                        if (month.getDays() < Months.valueOf(in).getDays()) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                case 5:
                    for (Months month : Months.values()) {
                        if (month.getDays() > Months.valueOf(in).getDays()) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                case 6:
                    // method .ordinal() return element index in enum
                    int nextIndex = Seasons.valueOf(in).ordinal() + 1;

                    if (nextIndex == Seasons.values().length) {
                        System.out.println(Seasons.values()[0]);

                        break;
                    }

                    System.out.println(Seasons.values()[nextIndex]);

                    break;
                case 7:
                    // method .ordinal() return element index in enum
                    int prevIndex = Seasons.valueOf(in).ordinal() - 1;

                    if (prevIndex < 0) {
                        System.out.println(Seasons.values()[Seasons.values().length - 1]);

                        break;
                    }

                    System.out.println(Seasons.values()[prevIndex]);

                    break;
                case 8:
                    for (Months month : Months.values()) {
                        if (month.getDays() % 2 == 0) {
                            System.out.println(month.name());
                        }
                    }

                    break;
                case 9:
                    for (Months month : Months.values()) {
                        if (month.getDays() % 2 != 0) {
                            System.out.println(month.name());
                        }
                    }

                    break;
                case 10:
                    if (Months.valueOf(in).getDays() % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }

                    break;
                case 11:
                default:
                    System.exit(0);
            }
        }
    }
}