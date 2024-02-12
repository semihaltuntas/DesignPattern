package be.vdab.theorie.adapter;

public class NieuweSpellingsControle {
    private String taal;
    private String tekst;

    public NieuweSpellingsControle(String taal, String tekst) {
        this.taal = taal;
        this.tekst = tekst;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    String[] geefFouten() {
        return new String[]{"Fout1","Fout2","Fout3"};
    }
}
