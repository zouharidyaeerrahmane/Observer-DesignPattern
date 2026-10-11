package com.zouhari;


import com.zouhari.obs.*;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();

        observable.addObserver(o1);
        observable.addObserver(o2);


        observable.setState(60);
        observable.setState(40);
        observable.removeObserver(o2);
        observable.setState(80);

        }
    }
