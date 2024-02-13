package be.vdab.theorie.Observer;

public class Aandeelhouder implements Observer {
    private final String voornaam;

    public Aandeelhouder(String voornaam) {
        this.voornaam = voornaam;
    }
    public void update ( Aandeel aandeel){
        System.out.println(voornaam + " koopt of verkoopt "+aandeel.getCode()
                +" met koers "+ aandeel.getKoers());
    }
}
