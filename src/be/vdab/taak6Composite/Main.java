package be.vdab.taak6Composite;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();

        Arbeidskosten arbeidskosten = new Arbeidskosten(BigDecimal.valueOf(2_000),
                BigDecimal.valueOf(3));
        GrondstofKosten grondstofKosten = new GrondstofKosten(BigDecimal.TEN,
                BigDecimal.valueOf(200));

        project.addKost(arbeidskosten);
        project.addKost(grondstofKosten);
        System.out.println("project.berekenenPrijs() = " + project.berekenenPrijs());

        /* -------------------------        -------------------------*/
        Project subProject = new Project();

        Arbeidskosten arbeidskosten1= new Arbeidskosten(BigDecimal.valueOf(3_000),
                BigDecimal.valueOf(5));
        GrondstofKosten grondstofKosten1 = new GrondstofKosten(BigDecimal.TWO,
                BigDecimal.valueOf(300));

        subProject.addKost(arbeidskosten1);
        subProject.addKost(grondstofKosten1);

        project.addKost(subProject);


        System.out.println("berekenenPrijs() met subProject = " + project.berekenenPrijs());


    }
}
