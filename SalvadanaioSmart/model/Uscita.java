package model;

import java.time.LocalDate;

public class Uscita extends Movimento {
    public Uscita(double importo, String descrizione, LocalDate data) {
        super(importo, descrizione, data);
    }

    @Override
    public String getTipo() {
        return "Uscita";
    }
}
