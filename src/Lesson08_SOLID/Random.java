package Lesson08_SOLID;

public class Random {
    public static int randomInt(int min, int max) {
        return min + (int) (Math.random() * max);
    }
}
