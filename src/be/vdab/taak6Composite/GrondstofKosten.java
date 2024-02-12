package be.vdab.taak6Composite;

import java.math.BigDecimal;

public class GrondstofKosten implements Prijs {
    private BigDecimal eenheidsPrijs;
    private BigDecimal hoveelheid;

    public GrondstofKosten(BigDecimal eenheidsPrijs, BigDecimal hoveelheid) {
        this.eenheidsPrijs = eenheidsPrijs;
        this.hoveelheid = hoveelheid;
    }

    @Override
    public BigDecimal berekenenPrijs() {
        return eenheidsPrijs.multiply(hoveelheid);
    }
}
