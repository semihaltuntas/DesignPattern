package be.vdab.theorie.composite;

public class Cirkel implements Figuur{

    private final double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    public double getOppervlakte() {
        return straal * straal * Math.PI ;
    }


}
