package be.vdab.theorie.adapter2;

public class SamsungTelefon implements Telefon {
    private int calısmaVoltajı;

    public SamsungTelefon() {
        this.calısmaVoltajı = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon Sarj oluyor.");
        return calısmaVoltajı;
    }
}
