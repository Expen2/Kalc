package Exeption;

public class OtricatelnoeRimskoe extends Exception {
    private String message = "в римской системе нет отрицательных чисел";

    @Override
    public String toString() {
        return message;
    }
}
