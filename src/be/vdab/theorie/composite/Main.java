package be.vdab.theorie.composite;

public class Main {
    public static void main(String[] args) {
        Tekening tekening = new Tekening();

        tekening.add(new Rechthoek(2, 1));
        tekening.add(new Cirkel(3));
        System.out.println("Tekening :"+tekening.getOppervlakte());

        var subTekening = new Tekening();
        subTekening.add(new Rechthoek(3, 2));
        subTekening.add(new Cirkel(4));

        System.out.println("subTekening = " + subTekening.getOppervlakte());

        var subTekening2 = new Tekening();
        subTekening2.add(new Driehoek(5.4,6.3));

        System.out.println("subTekening2 = " + subTekening2.getOppervlakte());

        tekening.add(subTekening);
        tekening.add(subTekening2);
        System.out.println("Totaal :"+tekening.getOppervlakte());

    }


}
