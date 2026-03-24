package esercizi_date;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class date4 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime dataFinale = data.plusYears(1)   
                                        .minusMonths(1) 
                                        .plusDays(7);   

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                                                       .withLocale(Locale.ITALY);
        
        System.out.println(dataFinale.format(formatter));
    }
}