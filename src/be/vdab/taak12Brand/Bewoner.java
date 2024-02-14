package be.vdab.taak12Brand;

public class Bewoner implements Observer {
    private final String voornaam;

    public Bewoner(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void update(Brand brand) {
        System.out.println(voornaam + " vlucht weg");
    }
}
