package be.vdab.theorie.adapter2;

public class Buzdolabı implements ElektrikliEvAletleri {
    private int volt;

    public Buzdolabı() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalıstır() {
        System.out.println("Ütü calısıyor.");
        return volt;
    }
}
