package Lesson12;

import Lesson08_SOLID.Random;

import java.util.Arrays;
import java.util.Collections;

public class Lesson12Task1 {

    public static void main(String[] args) {
        Integer[] myArr = new Integer[5];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Random.randomInt(1, 100);
        }

        System.out.println(Arrays.toString(myArr));

        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));

        Arrays.sort(myArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArr));
    }
}