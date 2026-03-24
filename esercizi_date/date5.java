package esercizi_date;
import java.time.OffsetDateTime;

public class date5 {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean precedente = data1.isBefore(data2);
        boolean successiva = data2.isAfter(data1);
        
        OffsetDateTime ora = OffsetDateTime.now();
        boolean data1UgualeOra = data1.isEqual(ora);
        boolean data2UgualeOra = data2.isEqual(ora);

        System.out.println("La prima data è precedente alla seconda? " + precedente);
        System.out.println("La seconda data è successiva alla prima? " + successiva);
        System.out.println("La prima data è uguale ad ora? " + data1UgualeOra);
        System.out.println("La seconda data è uguale ad ora? " + data2UgualeOra);
    }
}