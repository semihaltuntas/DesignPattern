package be.vdab.taak10Kerstboom;

public class MetLichtjes extends KerstboomDecorator{
    public MetLichtjes(Kerstboom gedecoreerdeKerstboom) {
        super(gedecoreerdeKerstboom);
    }

    @Override
    public String informatie() {
        return gedecoreerdeKerstboom.informatie() + " ,met Lichtjes!";
    }
}
