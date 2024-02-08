package be.vdab.taak4Builder;

public class Main {
    public static void main(String[] args) {
        var builder = new Coordinaten.CoordinatBuilder();
        var coordinaat = builder
                .metX(2.4)
                .metY(4.5)
                .metZ(8.3)
                .maakCoordinat();
        System.out.println(coordinaat);
    }
}
