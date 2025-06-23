package model;

import java.time.LocalDate;

public class MovimentoFactory {
    public static Movimento creaMovimento(String tipo, double importo, String descrizione, LocalDate data) {
        return switch (tipo.toLowerCase()) {
            case "entrata" -> new Entrata(importo, descrizione, data);
            case "uscita" -> new Uscita(importo, descrizione, data);
            default -> throw new IllegalArgumentException("Tipo movimento non valido");
        };
    }
}
