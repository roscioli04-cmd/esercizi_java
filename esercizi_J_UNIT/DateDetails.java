import java.time.OffsetDateTime;
import java.time.Month;
import java.time.DayOfWeek;

public class DateDetails {

    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";
        
        OffsetDateTime data = OffsetDateTime.parse(inputString);
        
        int anno = data.getYear();
        Month mese = data.getMonth();
        int giorno = data.getDayOfMonth();
        DayOfWeek giornoSettimana = data.getDayOfWeek();
        
        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}