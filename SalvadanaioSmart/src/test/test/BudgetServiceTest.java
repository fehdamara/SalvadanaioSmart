package test;

import model.Budget;
import org.junit.jupiter.api.Test;
import service.BudgetNotifier;
import service.BudgetService;

import static org.junit.jupiter.api.Assertions.*;

public class BudgetServiceTest {

    @Test
    void testSuperamentoBudget() {
        Budget b = new Budget(100);
        BudgetNotifier notifier = new BudgetNotifier();
        BudgetService bs = new BudgetService(b, notifier);
        bs.registraSpesa(150);
        assertTrue(b.isSuperato());
    }
}
