package model;

import java.time.LocalDate;

public class Entrata extends Movimento {
    public Entrata(double importo, String descrizione, LocalDate data) {
        super(importo, descrizione, data);
    }

    @Override
    public String getTipo() {
        return "Entrata";
    }
}
