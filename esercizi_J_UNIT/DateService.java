package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateService {
    public String formatta(String isoString, FormatStyle style) {
        OffsetDateTime data = OffsetDateTime.parse(isoString);
        // Usiamo Locale.ITALY per far corrispondere i test alle stringhe in italiano
        return data.format(DateTimeFormatter.ofLocalizedDate(style).withLocale(Locale.ITALY));
    }
}