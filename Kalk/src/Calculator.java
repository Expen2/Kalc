import Exeption.BolshoeChislo;

import java.util.Scanner;

public class Calculator {


    private StrokaVvoda strokaVvoda = new StrokaVvoda();

    public void start() {
        strokaVvoda.proverka();
    }

    public int sloghenie(int n1, int n2) {
        if (n1 <= 10 && n2 <= 10) {
            return n1 + n2;

        } else {
            try {
                throw new BolshoeChislo();

            } catch (BolshoeChislo e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

    public int ymoghenie(int n1, int n2) {
        if (n1 <= 10 && n2 <= 10) {
            return n1 * n2;

        } else {
            try {
                throw new BolshoeChislo();

            } catch (BolshoeChislo e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

    public int vichitanie(int n1, int n2) {
        if (n1 <= 10 && n2 <= 10) {
            return n1 - n2;

        } else {
            try {
                throw new BolshoeChislo();

            } catch (BolshoeChislo e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

    public int delenie(int n1, int n2) {
        if (n1 <= 10 && n2 <= 10) {
            return n1 / n2;

        } else {
            try {
                throw new BolshoeChislo();

            } catch (BolshoeChislo e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

}
