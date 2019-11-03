package Lesson10_Exception.Task2;

public class MyException extends Exception {
    public MyException() {
        super("Don't touch it, it's mine");
    }
}
