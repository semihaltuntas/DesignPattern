package be.vdab.taak3simplefactory;

public class Main {
    public static void main(String[] args) {

        int leeftijd1 = 15;
        int leeftijd2 = 7;
        int leeftijd3=4;

        var speelGoed = SpeelGoedFactory.INSTANCE.kiesSpeelGoed(leeftijd1);
        System.out.println("prijs voor " + leeftijd1 + " leeftijd =" + speelGoed.getPrijs()+" Euro");

        var speelGoed1 = SpeelGoedFactory.INSTANCE.kiesSpeelGoed(leeftijd2);
        System.out.println("prijs voor " + leeftijd2 + " leeftijd =" + speelGoed1.getPrijs()+" Euro");

        var speelGoed2 = SpeelGoedFactory.INSTANCE.kiesSpeelGoed(leeftijd3);
        System.out.println("prijs voor " + leeftijd3 + " leeftijd =" + speelGoed2.getPrijs()+" Euro");

    }
}
