package be.vdab.theorie;

public class MainInwoner {
    public static void main(String[] args) {
        var builder = new Inwoner.InwonerBuilder();
        var inwoner = builder.metVoornaam("Semih")
                .metFamilienaam("Altuntas")
                .metAantalKinderen(2)
                .maakInwoner();
        System.out.println(inwoner);
    }
}
