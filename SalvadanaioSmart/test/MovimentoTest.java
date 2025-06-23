package test;

import model.Entrata;
import model.Uscita;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MovimentoTest {

    @Test
    void testEntrata() {
        Entrata e = new Entrata(100.0, "Stipendio", LocalDate.now());
        assertEquals("Entrata", e.getTipo());
        assertEquals(100.0, e.getImporto());
    }

    @Test
    void testUscita() {
        Uscita u = new Uscita(50.0, "Spesa", LocalDate.now());
        assertEquals("Uscita", u.getTipo());
        assertEquals(50.0, u.getImporto());
    }
}
