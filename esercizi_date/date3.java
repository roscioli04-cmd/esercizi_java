package esercizi_date;
import java.time.OffsetDateTime;

public class date3 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int anno = data.getYear();
        String mese = String.valueOf(data.getMonth());
        int giorno = data.getDayOfMonth();
        String giornoSettimana = String.valueOf(data.getDayOfWeek());

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}