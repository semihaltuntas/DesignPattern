package be.vdab.taak5Facade;

public class CdSpeler implements Geluidsbron {
    @Override
    public void start() {
        System.out.println("CdSpeler gestart");
    }

    @Override
    public void stop() {
        System.out.println("CdSpeler gestopt");
    }
}
