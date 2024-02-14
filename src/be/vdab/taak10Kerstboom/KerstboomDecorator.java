package be.vdab.taak10Kerstboom;

abstract class KerstboomDecorator implements Kerstboom {

    protected final Kerstboom gedecoreerdeKerstboom;

    public KerstboomDecorator(Kerstboom gedecoreerdeKerstboom) {
        this.gedecoreerdeKerstboom = gedecoreerdeKerstboom;
    }
}
