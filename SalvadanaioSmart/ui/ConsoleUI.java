package ui;

import model.Movimento;
import model.MovimentoFactory;
import service.MovimentoService;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI {
    private final MovimentoService movimentoService = new MovimentoService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Benvenuto nel Salvadanaio!");
        while (true) {
            System.out.println("\n1. Aggiungi Movimento\n2. Visualizza Movimenti\n0. Esci");
            String scelta = scanner.nextLine();
            switch (scelta) {
                case "1" -> aggiungiMovimento();
                case "2" -> mostraMovimenti();
                case "0" -> {
                    System.out.println("Arrivederci!");
                    return;
                }
                default -> System.out.println("Scelta non valida.");
            }
        }
    }

    private void aggiungiMovimento() {
        System.out.print("Tipo (entrata/uscita): ");
        String tipo = scanner.nextLine().trim();
        System.out.print("Importo: ");
        double importo = Double.parseDouble(scanner.nextLine());
        System.out.print("Descrizione: ");
        String desc = scanner.nextLine();
        Movimento m = MovimentoFactory.creaMovimento(tipo, importo, desc, LocalDate.now());
        movimentoService.aggiungiMovimento(m);
        System.out.println("Movimento aggiunto.");
    }

    private void mostraMovimenti() {
        for (Movimento m : movimentoService.getTutti()) {
            System.out.printf("%s | €%.2f | %s | %s\n", m.getTipo(), m.getImporto(), m.getDescrizione(), m.getData());
        }
    }
}
