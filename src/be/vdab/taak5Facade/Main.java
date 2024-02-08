package be.vdab.taak5Facade;

public class Main {
    public static void main(String[] args) {
        var stereoketen = new Stereoketen();

        stereoketen.start();
        System.out.println("---");
        stereoketen.startRadio();
        System.out.println("---");
        stereoketen.startCdSpeler();
        System.out.println("---");
        stereoketen.startRadio();
        System.out.println("---");
        stereoketen.stop();
    }
}
