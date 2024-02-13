package be.vdab.theorie.Observer;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class Aandeel {
    private final String code;
    private BigDecimal koers;
    private final Set<Observer> observers = new LinkedHashSet<>();

    public Aandeel(String code) {
        this.code = code;
    }
    void addObserver (Observer observer){
        observers.add(observer);
    }
    void removeObserver (Observer observer){
        observers.remove(observer);
    }
    void notifyObservers(){
        observers.forEach(observer -> observer.update(this));
    }
    void setKoers (BigDecimal niueweKoers){
        this.koers = niueweKoers;
        notifyObservers();
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getKoers() {
        return koers;
    }
}
