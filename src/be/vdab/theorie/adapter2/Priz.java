package be.vdab.theorie.adapter2;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt = elektrikliEvAletleri.prizeTakVeCalıstır();
        System.out.println("Prizden "+ volt + " alınıyor");
    }
}
