package Lesson16_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Map<Person, ArrayList<Animal>> map = new HashMap<>();
            ZooClub zooClub = new ZooClub();
            boolean exit = false;

            while (!exit) {
                System.out.println("1. Add member of club");
                System.out.println("2. Add pet to member of club");
                System.out.println("3. Remove pet from member of club");
                System.out.println("4. Remove person from member of club");
//                System.out.println("5. Remove pet for all persons");
                System.out.println("6. Print all from zoo club");
                System.out.println("7. Exit");

                System.out.println("Enter number");
                Scanner sc1 = new Scanner(System.in);
                int number = sc1.nextInt();


                switch (number) {
                    case 1:
                        Person person = scanPerson();
                        zooClub.addPerson(person);
                        zooClub.printMap();
                        break;
                    case 2:
                        zooClub.printPersons();
                        Person person1 = zooClub.getKeyByIndex(scanIndex());
                        zooClub.addAnimal(person1, scanAnimal());
                        zooClub.printMap();
                        break;
                    case 3:
                        zooClub.printPersons();
                        Person person2 = zooClub.getKeyByIndex(scanIndex());

                        zooClub.printAnimals(person2);
                        zooClub.removeAnimal(person2, scanIndex());
                        zooClub.printMap();
                        break;
                    case 4:
                        zooClub.printPersons();
                        Person person3 = zooClub.getKeyByIndex(scanIndex());
                        zooClub.removePerson(person3);
                        zooClub.printMap();
                        break;
                    case 6:
                        zooClub.printMap();
                    case 7:
                        exit = true;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static public Person scanPerson() {
        System.out.println("Enter the name of person");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        System.out.println("Enter age of person");
        Scanner scan2 = new Scanner(System.in);
        int age = scan2.nextInt();

        return new Person(name, age);
    }

    static public Animal scanAnimal() {
        System.out.println("Enter name of animal");
        Scanner scan3 = new Scanner(System.in);
        String animalName = scan3.nextLine();
        System.out.println("Enter type of animal");
        Scanner scan4 = new Scanner(System.in);
        String type = scan4.nextLine();

        return new Animal(animalName, type);
    }

    static public int scanIndex() {
        System.out.println("Enter your index");
        Scanner scan1 = new Scanner(System.in);
        int index = scan1.nextInt();
        return index;
    }
}