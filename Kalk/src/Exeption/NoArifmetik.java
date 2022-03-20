package Exeption;

public class NoArifmetik extends Exception {
    private String messenge = "Не верный арифмитический знак";

    @Override
    public String toString() {
        return messenge;
    }
}
