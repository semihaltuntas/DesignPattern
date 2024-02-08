package be.vdab.theorie;

import java.math.BigDecimal;

public class Lening {
    public final BigDecimal bedrag;

    Lening(BigDecimal bedrag) {
        this.bedrag = bedrag;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}
