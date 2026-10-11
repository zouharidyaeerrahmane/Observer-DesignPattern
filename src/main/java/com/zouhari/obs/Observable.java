package com.zouhari.obs;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
