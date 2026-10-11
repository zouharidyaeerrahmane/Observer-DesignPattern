package com.zouhari.obs;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("+++++++++++++++++++");
        System.out.println("New state: " + newState);
        System.out.println("+++++++++++++++++++");

    }
}
