package be.vdab.theorie.composite;

import java.util.ArrayList;
import java.util.List;

public class Tekening implements Figuur {

    private final List<Figuur> figuren = new ArrayList<>();

    void add(Figuur figuur) {
        figuren.add(figuur);
    }

    @Override
    public double getOppervlakte() {
        return figuren.stream().mapToDouble(figuur -> figuur.getOppervlakte()).sum();
    }
}
