package be.vdab.theorie.adapter;

public class OudeSpellingsControle {
    private String taal;
    private String tekst;

    public OudeSpellingsControle() {
    }

    void setTaal(String taal) {
        this.taal = taal;

    }

    void setTekst(String tekst) {
        this.tekst = tekst;
    }

    String[] controleerSpellingEnGeefFouten() {
        return new String[]{"1Fout", "2Fout"};
    }

}


