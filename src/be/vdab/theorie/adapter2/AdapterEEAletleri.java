package be.vdab.theorie.adapter2;

public class AdapterEEAletleri implements ElektrikliEvAletleri{
    private Telefon telefon;

    public AdapterEEAletleri(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalıstır() {
        return telefon.sarjEt();
    }
}
