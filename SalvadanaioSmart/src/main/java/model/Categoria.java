package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Categoria implements Iterable<Movimento> {
    private String nome;
    private List<Movimento> movimenti;
    private List<Categoria> sottocategorie;

    public Categoria(String nome) {
        this.nome = nome;
        this.movimenti = new ArrayList<>();
        this.sottocategorie = new ArrayList<>();
    }

    public void aggiungiMovimento(Movimento movimento) {
        movimenti.add(movimento);
    }

    public void aggiungiSottocategoria(Categoria categoria) {
        sottocategorie.add(categoria);
    }

    public String getNome() {
        return nome;
    }

    public List<Categoria> getSottocategorie() {
        return sottocategorie;
    }

    @Override
    public Iterator<Movimento> iterator() {
        return movimenti.iterator();
    }
}
