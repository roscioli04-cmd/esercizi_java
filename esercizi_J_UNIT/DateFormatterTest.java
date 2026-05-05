package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.format.FormatStyle;

public class DateFormatterTest {

    private final OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    void testFormatoFull() {
        String risultato = DateFormatter.formattaData(data, FormatStyle.FULL);
        // FULL in italiano contiene il giorno della settimana e il mese per esteso
        // Esempio: "venerdì 1 marzo 2002..."
        assertTrue(risultato.contains("marzo"));
        assertTrue(risultato.contains("2002"));
    }

    private void assertTrue(boolean contains) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    void testFormatoMedium() {
        String risultato = DateFormatter.formattaData(data, FormatStyle.MEDIUM);
        // Normalizziamo gli spazi (Java usa spesso lo spazio indivisibile \u00A0)
        String risultatoNormalizzato = risultato.replace("\u00A0", " ");
        
        // Aspettatevi: "1 mar 2002, 13:00:00"
        assertEquals("1 mar 2002, 13:00:00", risultatoNormalizzato);
    }

    @Test
    void testFormatoShort() {
        String risultato = DateFormatter.formattaData(data, FormatStyle.SHORT);
        String risultatoNormalizzato = risultato.replace("\u00A0", " ");
        
        // Aspettatevi: "01/03/02, 13:00"
        assertEquals("01/03/02, 13:00", risultatoNormalizzato);
    }

    private void assertEquals(String string, String risultatoNormalizzato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}