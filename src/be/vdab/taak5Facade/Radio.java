package be.vdab.taak5Facade;

public class Radio implements Geluidsbron {
    @Override
    public void start() {
        System.out.println("Radio gestart");
    }

    @Override
    public void stop() {
        System.out.println("Radio gestopt");
    }
}
