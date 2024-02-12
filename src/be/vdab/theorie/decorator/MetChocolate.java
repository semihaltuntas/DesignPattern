package be.vdab.theorie.decorator;

import java.math.BigDecimal;

public class MetChocolate extends KoffieDecorator{
    public MetChocolate(Koffie koffie) {
        super(koffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecorateerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }

    @Override
    public String getBereidingswijze() {
        return gedecorateerdeKoffie.getBereidingswijze() + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
