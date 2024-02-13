package be.vdab.taak7Decorator;

public class MetFietsen extends ArrangementDecorator {
    public MetFietsen(Arrangement gedecoreerdeArrangement) {
        super(gedecoreerdeArrangement);
    }

    @Override
    public String getTaken() {
        return gedecoreerdeArrangement.getTaken() + " ,plaats fietsen bij de bungalow";
    }
}
