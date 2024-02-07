package be.vdab.theorie;

public class Tekst extends Document {
    Tekst(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() {
        System.out.println("een afdruk van een tekst");
    }

    @Override
    void printPreview() {
        System.out.println("een afdrukvoorbeeld van een tekst");
    }


}
