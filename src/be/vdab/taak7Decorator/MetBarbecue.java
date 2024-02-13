package be.vdab.taak7Decorator;

public class MetBarbecue extends  ArrangementDecorator{
    public MetBarbecue(Arrangement gedecoreerdeArrangement) {
        super(gedecoreerdeArrangement);
    }

    @Override
    public String getTaken() {
        return gedecoreerdeArrangement.getTaken() + " ,plaats een barbecue bij de bungalow";
    }
}
