package model;

public class Budget {
    private double limite;
    private double speso;

    public Budget(double limite) {
        this.limite = limite;
        this.speso = 0;
    }

    public void aggiungiSpesa(double importo) {
        speso += importo;
    }

    public boolean isSuperato() {
        return speso > limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSpeso() {
        return speso;
    }
}
