package Lesson18_Core_Inner_classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {32, 234, 53, 23, 3};
        Collection collection = new Collection(numbers);
        System.out.println("Task1: ");
        System.out.println(Arrays.toString(numbers));
        collection.print();

        System.out.println("Task2");
        System.out.println(Arrays.toString(numbers));
        collection.printTask2();
    }
}
