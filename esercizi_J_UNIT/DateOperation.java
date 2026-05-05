package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateOperation {

    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";
        
        OffsetDateTime dataOriginale = OffsetDateTime.parse(inputString);
        
        OffsetDateTime dataModificata = eseguiOperazioni(dataOriginale);
        
        String risultatoFinal = formattaDataItalia(dataModificata);
        
        System.out.println("Risultato finale: " + risultatoFinal);
    }

    public static OffsetDateTime eseguiOperazioni(OffsetDateTime data) {
        return data.plusYears(1)
                   .minusMonths(1)
                   .plusDays(7);
    }

    public static String formattaDataItalia(OffsetDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .withLocale(Locale.ITALY);
        return data.format(formatter);
    }
}