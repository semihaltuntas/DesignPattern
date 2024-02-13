package be.vdab.taak7Decorator;

abstract class ArrangementDecorator implements Arrangement {

    protected final Arrangement gedecoreerdeArrangement;

    public ArrangementDecorator(Arrangement gedecoreerdeArrangement) {
        this.gedecoreerdeArrangement = gedecoreerdeArrangement;
    }
}
