package be.vdab.taak6Composite;

import java.math.BigDecimal;

public class Arbeidskosten implements Prijs{

    private BigDecimal uurloon;
    private BigDecimal anatalUren;

    public Arbeidskosten(BigDecimal uurloon, BigDecimal anatalUren) {
        this.uurloon = uurloon;
        this.anatalUren = anatalUren;
    }

    @Override
    public BigDecimal berekenenPrijs() {
        return anatalUren.multiply(uurloon);
    }
}
