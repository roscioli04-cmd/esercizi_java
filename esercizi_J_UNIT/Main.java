import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            String dataInput = "2002-03-01T13:00:00Z";
            OffsetDateTime data = OffsetDateTime.parse(dataInput);
            
            String formattata = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY));
            
            System.out.println("Risultato: " + formattata);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}