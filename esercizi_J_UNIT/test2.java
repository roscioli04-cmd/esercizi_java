package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class test2 {


    public String formattaDataShort(String isoString) {
        OffsetDateTime data = OffsetDateTime.parse(isoString);
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY));
    }
}