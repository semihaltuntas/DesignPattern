package be.vdab.taak4Builder;

public class Coordinaten {
    private final double x;
    private final double y;
    private final double z;

    private Coordinaten(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    static class CoordinatBuilder {
        private double x;
        private double y;
        private double z;

        CoordinatBuilder metX(double x) {
            this.x = x;
            return this;
        }

        CoordinatBuilder metY(double y) {
            this.y = y;
            return this;
        }

        CoordinatBuilder metZ(double z) {
            this.z = z;
            return this;
        }

        Coordinaten maakCoordinat() {
            return new Coordinaten(x, y, z);
        }

    }
}
