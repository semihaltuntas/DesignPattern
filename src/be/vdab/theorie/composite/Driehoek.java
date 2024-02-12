package be.vdab.theorie.composite;

public class Driehoek implements Figuur {
    private final double basisLengte;
    private final double hoogte;

    public Driehoek(double basisLengte, double hoogte) {
        this.basisLengte = basisLengte;
        this.hoogte = hoogte;
    }

    @Override
    public double getOppervlakte() {
        return (basisLengte * hoogte) / 2;
    }
}
