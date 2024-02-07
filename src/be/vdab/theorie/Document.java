package be.vdab.theorie;

abstract class Document {
    private final String bestandNaam;
    protected Document(String bestandNaam){
        this.bestandNaam = bestandNaam;
    }
    abstract void print();
    abstract void printPreview();
}
