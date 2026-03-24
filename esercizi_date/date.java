package esercizi_date;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class date {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println("FULL: " + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("MEDIUM: " + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("SHORT: " + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
}