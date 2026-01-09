package model;

import java.time.LocalDate;

public abstract class Movimento {
    protected double importo;
    protected String descrizione;
    protected LocalDate data;

    public Movimento(double importo, String descrizione, LocalDate data) {
        this.importo = importo;
        this.descrizione = descrizione;
        this.data = data;
    }

    public abstract String getTipo();

    public double getImporto() {
        return importo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public LocalDate getData() {
        return data;
    }
}
