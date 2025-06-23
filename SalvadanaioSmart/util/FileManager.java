package util;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    private static final Logger logger = Logger.getLogger(FileManager.class.getName());

    public static void scrivi(String path, String contenuto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(contenuto);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Errore durante il salvataggio file", e);
        }
    }

    public static String leggi(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String riga;
            while ((riga = reader.readLine()) != null) {
                sb.append(riga).append("\n");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Errore durante la lettura file", e);
        }
        return sb.toString();
    }
}
// This utility class provides methods to read from and write to files,