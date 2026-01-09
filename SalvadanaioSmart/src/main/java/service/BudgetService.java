package service;

import model.Budget;

public class BudgetService {
    private final Budget budget;
    private final BudgetNotifier notifier;

    public BudgetService(Budget budget, BudgetNotifier notifier) {
        this.budget = budget;
        this.notifier = notifier;
    }

    public void registraSpesa(double importo) {
        budget.aggiungiSpesa(importo);
        if (budget.isSuperato()) {
            notifier.notifica(budget.getSpeso(), budget.getLimite());
        }
    }

    public Budget getBudget() {
        return budget;
    }
}
// This class provides methods to register expenses and check if the budget
// limit