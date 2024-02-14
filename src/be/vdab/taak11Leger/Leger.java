package be.vdab.taak11Leger;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Leger implements Strijdbaar {
    private final List<Peloton> pelotons = new LinkedList<>();

    void addPeloton(Peloton peloton) {
        pelotons.add(peloton);
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("Het leger trekt ten strijde.");
        pelotons.forEach(peloton -> peloton.trekTenStrijde());
    }


}
