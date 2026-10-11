package com.zouhari.obs;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            System.out.println("+++++++++++++++++++");
            System.out.println("New state: " + obs.getState());
            System.out.println("+++++++++++++++++++");
        }


    }
}
