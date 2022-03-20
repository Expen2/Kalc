package Exeption;

public class NoComand extends Exception {
    String message = "числа не соответсвуют условиям";

    @Override
    public String toString() {
        return message;
    }


}
