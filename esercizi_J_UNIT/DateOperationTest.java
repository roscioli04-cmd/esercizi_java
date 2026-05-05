package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.Month;

public class DateOperationTest {

    private final OffsetDateTime partenza = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void testOperazioniDate() {
        OffsetDateTime risultato = DateOperation.eseguiOperazioni(partenza);
        
        assertEquals(2024, risultato.getYear());
        assertEquals(Month.FEBRUARY, risultato.getMonth());
        assertEquals(8, risultato.getDayOfMonth());
    }

    private void assertEquals(Month february, Month month) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(int i, int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testFormattazioneItalia() {
        OffsetDateTime data = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        String formattata = DateOperation.formattaDataItalia(data);
        
        // Adesso usiamo assertTrue direttamente grazie all'import statico
        assertTrue(formattata.contains("febbraio"));
        assertTrue(formattata.contains("2024"));
    }

    private void assertTrue(boolean contains) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }
}