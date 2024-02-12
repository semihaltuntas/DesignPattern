package be.vdab.theorie.decorator;

import java.math.BigDecimal;

public abstract class KoffieDecorator implements Koffie{
    protected final Koffie gedecorateerdeKoffie;

    public KoffieDecorator(Koffie gedecorateerdeKoffie) {
        this.gedecorateerdeKoffie = gedecorateerdeKoffie;
    }
}
