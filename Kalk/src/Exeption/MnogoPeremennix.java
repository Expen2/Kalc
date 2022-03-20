package Exeption;

public class MnogoPeremennix extends Exception {
    private String message = "формат математической операции не удовлетворяет заданию";

    @Override
    public String toString() {
        return message;
    }
}
