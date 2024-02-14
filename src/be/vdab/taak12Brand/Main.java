package be.vdab.taak12Brand;

public class Main {
    public static void main(String[] args) {

        Bewoner bewoner1 = new Bewoner("Semih");
        Bewoner bewoner2 = new Bewoner("Mustafa");


        Braandweer braandweer1 = new Braandweer(10);
        Braandweer braandweer2 = new Braandweer(20);

        Brand brand = new Brand();

        brand.addObserver(bewoner1);
        brand.addObserver(bewoner2);

        brand.addObserver(braandweer1);
        brand.addObserver(braandweer2);

        brand.breekUit();

    }
}
