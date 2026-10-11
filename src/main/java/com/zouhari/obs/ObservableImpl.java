package com.zouhari.obs;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }

    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
