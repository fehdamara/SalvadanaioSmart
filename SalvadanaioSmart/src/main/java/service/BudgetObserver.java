package service;

public interface BudgetObserver {
    void notificaSuperamento(double speso, double limite);
}
// This interface defines a method to notify when a budget limit is exceeded.