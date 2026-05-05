package esercizi_J_UNIT;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatePrinter {

    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";
        
      
        OffsetDateTime data = OffsetDateTime.parse(inputString);
        
    
        String dataFormattata = formattaDataSpecifica(data);
        
       
        System.out.println("Data formattata: " + dataFormattata);
    }

  
    public static String formattaDataSpecifica(OffsetDateTime data) {
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        return data.format(formatter);
    }
}