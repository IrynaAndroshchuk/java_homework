package Lesson11;

import Lesson11.Task1.MyException;

import java.util.Scanner;

public class Lesson11Task1 {

    public static void main(String[] args) throws MyException {
        System.out.println("Enter world: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();

        if (word.length() != 5) {
            throw new MyException();
        }

        String rev = new StringBuffer(word).reverse().toString();

        if (word.equalsIgnoreCase(rev)) {
            System.out.println("This word is palindrome");
        } else {
            System.out.println("This word is not palindrome");
        }
    }
}