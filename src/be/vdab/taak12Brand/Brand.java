package be.vdab.taak12Brand;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Brand {
    private final List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObserver() {
        observers.forEach(observer -> observer.update(this));

    }

    void breekUit() {
        notifyObserver();

    }


}
