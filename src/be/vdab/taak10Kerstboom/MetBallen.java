package be.vdab.taak10Kerstboom;

public class MetBallen extends KerstboomDecorator{
    public MetBallen(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() +" ,met Ballen ";
    }
}
