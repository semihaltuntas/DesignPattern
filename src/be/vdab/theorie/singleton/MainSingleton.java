package be.vdab.theorie.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto();
    }

    private static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}
