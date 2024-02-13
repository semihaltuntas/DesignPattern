package be.vdab.theorie.Observer;

public class Overheid implements Observer {
    @Override
    public void update(Aandeel aandeel) {
        System.out.println("De overheid registreert de niuewe koers van "
                + aandeel.getCode() + " : " + aandeel.getKoers());
    }
}
