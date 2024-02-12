package be.vdab.theorie.decorator;

import java.math.BigDecimal;

public class MetSuiker extends KoffieDecorator {
    public MetSuiker(Koffie gedecorateerdeKoffie) {
        super(gedecorateerdeKoffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecorateerdeKoffie.getKost().add(BigDecimal.valueOf(4));
    }

    @Override
    public String getBereidingswijze() {
        return gedecorateerdeKoffie.getBereidingswijze() + " ,voeg een beetje suiker toe.";
    }
}
