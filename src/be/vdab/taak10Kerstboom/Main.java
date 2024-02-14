package be.vdab.taak10Kerstboom;

public class Main {
    public static void main(String[] args) {

        KaleKerstboom kaleKerstboom = new KaleKerstboom();
        MetLichtjes boom = new MetLichtjes(new MetSlingers(new MetBallen(kaleKerstboom)));
        System.out.println(boom.informatie());

    }
}
