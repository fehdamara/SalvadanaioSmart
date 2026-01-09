package service;

import model.Movimento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovimentoService {
    private final List<Movimento> movimenti = new ArrayList<>();

    public void aggiungiMovimento(Movimento m) {
        movimenti.add(m);
    }

    public List<Movimento> getTutti() {
        return movimenti;
    }

    public List<Movimento> filtraPerTipo(String tipo) {
        return movimenti.stream()
                .filter(m -> m.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }
}
// This service class manages a list of financial movements and provides methods