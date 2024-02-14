package be.vdab.taak10Kerstboom;

public class MetSlingers extends KerstboomDecorator{
    public MetSlingers(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() +" ,met slingers ";
    }
}
