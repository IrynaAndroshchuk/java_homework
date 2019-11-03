package Lesson10_Exception.Task1;

public class WrongConsoleParametersException extends Exception {
    public WrongConsoleParametersException(String message) {
        super(message);
    }
}
