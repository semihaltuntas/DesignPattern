package be.vdab.taak3simplefactory;

import java.math.BigDecimal;

 abstract class SpeelGoed {
    private BigDecimal prijs;

    SpeelGoed(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }
}
