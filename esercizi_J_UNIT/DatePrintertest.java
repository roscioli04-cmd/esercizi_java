package esercizi_J_UNIT;

import java.time.OffsetDateTime;

public class DatePrintertest {

    @Test
    void testFormattazioneSpecifica() {
        // Dati di input
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(input);
        
        // Esecuzione del metodo
        String risultato = DatePrinter.formattaDataSpecifica(data);
        
        // Verifica: deve essere esattamente "01 marzo 2023"
        // Nota: marzo è minuscolo in italiano secondo gli standard Java
        assertEquals("01 marzo 2023", risultato);
    }

    private void assertEquals(String string, String risultato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testGiornoSingolaCifra() {
        // Testiamo se aggiunge correttamente lo zero davanti al giorno (05 invece di 5)
        OffsetDateTime data = OffsetDateTime.parse("2023-03-05T13:00:00Z");
        String risultato = DatePrinter.formattaDataSpecifica(data);
        
        assertEquals("05 marzo 2023", risultato);
    }
}