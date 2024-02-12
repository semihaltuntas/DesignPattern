package be.vdab.theorie.adapter2;

public class Main {
    public static void main(String[] args) {

        Priz priz = new Priz();
        Ütü ütü = new Ütü();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(ütü);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        AdapterEEAletleri adapterEEAletleri = new AdapterEEAletleri(samsungTelefon);

        priz.elektrikVer(adapterEEAletleri);


    }
}
