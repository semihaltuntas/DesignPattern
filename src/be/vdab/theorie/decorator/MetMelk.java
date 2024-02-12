package be.vdab.theorie.decorator;

import java.math.BigDecimal;

public class MetMelk extends KoffieDecorator{

    public MetMelk(Koffie koffie) {
        super(koffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecorateerdeKoffie.getKost().add(BigDecimal.ONE);
    }

    @Override
    public String getBereidingswijze() {
        return gedecorateerdeKoffie.getBereidingswijze() + ", warm de melk, voeg de melk toe";
    }


}
