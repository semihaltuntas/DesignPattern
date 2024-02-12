package be.vdab.taak6Composite;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();

        project.addKost(new Arbeidskosten(BigDecimal.valueOf(2_000),
                BigDecimal.valueOf(3)));
        project.addKost(new GrondstofKosten(BigDecimal.TEN,
                BigDecimal.valueOf(200)));

        Project subProject = new Project();
        subProject.addKost(new Arbeidskosten(BigDecimal.valueOf(3_000),
                BigDecimal.valueOf(5)));
        subProject.addKost(new GrondstofKosten(BigDecimal.TWO,
                BigDecimal.valueOf(300)));

        project.addKost(subProject);


        System.out.println("project.berekenenPrijs() = " + project.berekenenPrijs());


    }
}
