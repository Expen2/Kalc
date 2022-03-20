package Exeption;

public class ArabskieOtricatelnii extends Exception{
    private String message = "Введите положительные числа";

    @Override
    public String toString() {
        return message;
    }
}
