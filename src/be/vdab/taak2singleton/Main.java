package be.vdab.taak2singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Magic8Ball.INSTANCE
                .getAntwoord("Win ik morgen de lotto ?"));
        System.out.println(Magic8Ball.INSTANCE
                .getAntwoord("Zal het morgen regenen ?"));
        System.out.println(Magic8Ball.INSTANCE
                .getAntwoord("Kan ik op een dag een rijk worden ?"));
    }
}
