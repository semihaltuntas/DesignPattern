package be.vdab.taak5Facade;

public class Stereoketen {

    private Versterker versterker = new Versterker();
    private Equalizer equalizer = new Equalizer();
    private CdSpeler cdSpeler = new CdSpeler();
    private Radio radio = new Radio();
    private Geluidsbron huidigeGeluidsbron;

    void start() {
        versterker.start();
        equalizer.start();
    }

    void stop() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        versterker.stop();
        equalizer.stop();
    }

    void startRadio() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        radio.start();
        huidigeGeluidsbron = radio;
    }

    void startCdSpeler() {
        if (huidigeGeluidsbron != null) {
            huidigeGeluidsbron.stop();
        }
        cdSpeler.start();
        huidigeGeluidsbron = cdSpeler;
    }
}
