package be.vdab.taak12Brand;

public class Braandweer implements Observer {

    private final int nummer;

    public Braandweer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public void update(Brand brand) {
        System.out.println(" Brandweerman " + nummer + " gaat blussen!");
    }
}
