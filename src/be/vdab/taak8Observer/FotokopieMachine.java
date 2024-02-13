package be.vdab.taak8Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class FotokopieMachine {
    private final static int ONDERHOUD_OM_DE_PAGINAS = 10_000;
    private final long SeriNummer;
    private int aantalPaginasSindsLaatsteOnderhoudsbeurt;
    private Set<Observer> observers = new LinkedHashSet<>();

    public FotokopieMachine(long seriNummer) {
        SeriNummer = seriNummer;
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    public long getSeriNummer() {
        return SeriNummer;
    }

    void doeOnderhoud() {
        aantalPaginasSindsLaatsteOnderhoudsbeurt = 0;
    }

    void kopieer(int paginas) {
        System.out.println(paginas + "fotokopies");
        aantalPaginasSindsLaatsteOnderhoudsbeurt += paginas;
        if (aantalPaginasSindsLaatsteOnderhoudsbeurt >= ONDERHOUD_OM_DE_PAGINAS) {
            notifyObserver();
            doeOnderhoud();
        }


    }
}
