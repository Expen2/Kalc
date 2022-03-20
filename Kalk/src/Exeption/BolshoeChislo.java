package Exeption;

public class BolshoeChislo extends Exception {
    private String messege = "Вы ввели слшком большое число";

    @Override
    public String toString() {
        return messege;

    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.exit(0);
    }
}