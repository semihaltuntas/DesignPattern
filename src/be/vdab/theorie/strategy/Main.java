package be.vdab.theorie.strategy;

public class Main {
    public static void main(String[] args) {
        var personen = new Persoon[]{
                new Persoon("Semih", "Altuntas", "heer"),
                new Persoon("Esra", "ALTUNTAS", "mevrouw"),
                // briefhoofdingen met informele aansprekingen:
        };
        for (var persoon : personen) {
            System.out.println(persoon.maakBriefHoofding(pers ->
                    "Dag " + pers.getVoornaam()));
        }
        // briefhoofdingen met formele aansprekingen:
//        for (var persoon : personen) {
//            System.out.println(persoon.maakBriefHoofding(pers ->
//                    "Geachte " + pers.getTitel() + " " + pers.getFamilienaam()));
//        }
//        System.out.println("------------");
//
//        var persoons = new Persoon[]{new Persoon("Jean", "Smits", "heer"),
//                new Persoon("Jeanine", "Desmet", "mevrouw")};
//        for (var persoon : persoons) {
//            System.out.println(persoon.maakBriefHoofding(
//                    (pers) -> informeel(pers.getVoornaam())));
//        }
//        for (var persoon : persoons) {
//            System.out.println(persoon.maakBriefHoofding(
//                    (pers) -> formeel(pers.getFamilienaam(), pers.getTitel())));
//        }
//    }
//
//    private static String informeel(String voornaam) {
//        return "Dag " + voornaam;
//    }
//
//    private static String formeel(String familienaam, String titel) {
//        return "Geachte " + titel + ' ' + familienaam;
//    }


    }
}

