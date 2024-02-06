package be.vdab.taak1singleton;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;

    void hoger(){
        if (versnelling == 5){
            throw new VerkeerdeVersnellingException();
        }
        versnelling++;
        System.out.println("vites artıldı :"+ versnelling);
    }

    void lager(){

        if (versnelling == -1){
            throw new VerkeerdeVersnellingException();
        }
        versnelling--;
        System.out.println("vites azaltıldı :"+ versnelling);
    }
}
