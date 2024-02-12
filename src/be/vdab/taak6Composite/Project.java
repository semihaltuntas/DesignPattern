package be.vdab.taak6Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Project implements Prijs {

    private List<Prijs> totaalPrijzen = new ArrayList<>();

 void addKost(Prijs prijs){
     totaalPrijzen.add(prijs);
 }


    @Override
    public BigDecimal berekenenPrijs() {
        return totaalPrijzen.stream()
                .map(prijs -> prijs.berekenenPrijs())
                .reduce(BigDecimal.ZERO, (vorigesom, bedrag) -> vorigesom.add(bedrag));

    }
}
