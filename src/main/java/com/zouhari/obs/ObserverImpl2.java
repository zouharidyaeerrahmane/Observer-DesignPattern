package com.zouhari.obs;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 */
public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
  
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            history.add(obs.getState());
            double sum=0;
            for (int i = 0; i < history.size(); i++) {
                sum += history.get(i);

            }
            System.out.println("Moyenne = "+ sum/history.size());
        }


    }
}
