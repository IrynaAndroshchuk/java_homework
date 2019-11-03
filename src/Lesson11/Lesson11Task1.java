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
        word = word.replace('a', '-');
        word = word.replace('e', '-');
        word = word.replace('i', '-');
        word = word.replace('o', '-');
        word = word.replace('u', '-');
        word = word.replace('y', '-');

        System.out.println("The new word is: " + word);
    }
}