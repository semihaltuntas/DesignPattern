package be.vdab.taak11Leger;

public class Soldaat implements Strijdbaar {
    private final String voornaam;

    public Soldaat(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\tSoldaat " + voornaam + " trekt ten strijde.");
    }
}
