package service;

import java.util.ArrayList;
import java.util.List;

public class BudgetNotifier {
    private final List<BudgetObserver> observers = new ArrayList<>();

    public void aggiungiOsservatore(BudgetObserver observer) {
        observers.add(observer);
    }

    public void notifica(double speso, double limite) {
        for (BudgetObserver obs : observers) {
            obs.notificaSuperamento(speso, limite);
        }
    }
}
// This class manages a list of observers and notifies them when a budget limit
// is exceeded.