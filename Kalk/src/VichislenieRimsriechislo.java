import Exeption.NoArifmetik;
import Exeption.OtricatelnoeRimskoe;

public class VichislenieRimsriechislo extends Calculator {

    private String[] chasti;

    public VichislenieRimsriechislo(String[] chasti) {
        this.chasti = chasti;
    }

    @Override
    public int sloghenie(int n1, int n2) {
        return super.sloghenie(n1, n2);
    }

    @Override
    public int  ymoghenie(int n1, int n2) {
        return super.ymoghenie(n1, n2);
    }

    @Override
    public int vichitanie(int n1, int n2) {
        return super.vichitanie(n1, n2);
    }

    @Override
    public int delenie(int n1, int n2) {
        return super.delenie(n1, n2);
    }

    public void rimskie() {
        int cislo1 = 0;
        int cislo2 = 0;
        for (Rimskie rimskie : Rimskie.values()) {
            if (chasti[0].equals(rimskie.name())) {
                cislo1 = rimskie.getCislo();

            }
            if (chasti[2].equals(rimskie.name())) {
                cislo2 = rimskie.getCislo();
            }
        }


        switch (chasti[1]) {
            case "+":
                piosk(sloghenie(cislo1, cislo2));
                break;
            case "-":
                piosk(vichitanie(cislo1, cislo2));
                break;
            case "*":
                piosk(ymoghenie(cislo1, cislo2));

                break;
            case "/":
                piosk(delenie(cislo1, cislo2));
                break;
            default:
                try {
                    throw new NoArifmetik();
                } catch (NoArifmetik e) {
                    e.printStackTrace();
                }
        }



    }
    public void piosk(int n){
        for (Rimskie rimskie:Rimskie.values()){
            if(n==rimskie.getCislo()){
                System.out.println(rimskie.name());
            }else {
                try {
                    throw  new OtricatelnoeRimskoe();
                } catch (OtricatelnoeRimskoe e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }

    }

}