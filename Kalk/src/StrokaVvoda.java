import Exeption.MnogoPeremennix;
import Exeption.NoComand;

import java.util.Scanner;

public class StrokaVvoda {
    public void proverka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш пример");
        String pervoe = scanner.nextLine();
        String[] chasti = pervoe.split(" ");
        boolean c = false;
        boolean c1 = false;
        if (chasti.length>3){
            try {
                throw new MnogoPeremennix();
            } catch (MnogoPeremennix e) {
                e.printStackTrace();
            }
        }

        for (Rimskie rimskie : Rimskie.values()) {
            try {
                if (chasti[0].equals(rimskie.name())) {
                    c = true;
                }
                if (chasti[2].equals(rimskie.name())) {
                    c1 = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("строка не является математической операцией");
                e.printStackTrace();
                System.exit(0);

            }
        }

        if (c & c1) {
            VichislenieRimsriechislo vichislenieRimsriechislo = new VichislenieRimsriechislo(chasti);
            vichislenieRimsriechislo.rimskie();

        } else if (c & !c1 || !c & c1) {
            try {
                throw new NoComand();
            } catch (NoComand e) {
                e.printStackTrace();
            }


        } else {

                ArabskieChisla arabskieChisla = new ArabskieChisla(chasti);
                arabskieChisla.vichislenia();


        }
    }
}
