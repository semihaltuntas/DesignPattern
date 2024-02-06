package be.vdab.theorie;

public class Main {
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto();
    }

    private static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}
