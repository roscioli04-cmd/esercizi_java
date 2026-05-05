import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatter {

    // Metodo che esegue la logica richiesta
    public static String formattaData(OffsetDateTime data, FormatStyle stile) {
        // Usiamo Locale.ITALY per avere mesi e giorni in italiano
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(stile)
                .withLocale(Locale.ITALY);
        return data.format(formatter);
    }

    public static void main(String[] args) {
        String inputString = "2002-03-01T13:00:00Z";
        
        // Creazione dell'oggetto OffsetDateTime
        OffsetDateTime data = OffsetDateTime.parse(inputString);

        // Stampa delle versioni richieste
        System.out.println("FULL:   " + formattaData(data, FormatStyle.FULL));
        System.out.println("MEDIUM: " + formattaData(data, FormatStyle.MEDIUM));
        System.out.println("SHORT:  " + formattaData(data, FormatStyle.SHORT));
    }
}