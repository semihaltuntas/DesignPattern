package be.vdab.taak2singleton;

import java.util.Random;

public enum Magic8Ball {
    INSTANCE;
    String[] antwoorden = new String[]{
            "Zoals ik het zie, ja", "Het is zeker",
            "Hoogst waarschijnlijk", "Ziet er goed uit", "Zonder twijfel.",
            "Ja.", "Zeker.", "Je mag er op rekenen.",
            "Vraag dit later nog eens.", "Dit wil je niet weten.",
            "Ik kan dit nu niet voorspellen.",
            "Concentreer je en stel je vraag opnieuw.", "Je moet er niet op rekenen.",
            "Nee.", "Ziet er niet goed uit.", "Zeer twijfelachtig."
    };

    private int vorigAantwoordIndex = -1;

    String getAntwoord(String vraag) {
        System.out.println("Vraag:" + vraag);
        var random = new Random();
        var antwoordIndex = random.nextInt(antwoorden.length);

        while (antwoordIndex == vorigAantwoordIndex) {
            antwoordIndex = random.nextInt(antwoorden.length);
        }
        vorigAantwoordIndex = antwoordIndex;
        return "Antwoord:" + antwoorden[antwoordIndex];
    }
}
