package be.vdab.theorie.adapter2;

public class Ütü implements ElektrikliEvAletleri{

    private int volt;

    public Ütü() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalıstır() {
        System.out.println("Ütü calısıyor.");
        return volt;
    }
}
