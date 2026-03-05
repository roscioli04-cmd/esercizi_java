package esercizio_StringBuilder;

public class Comparatore {
    public String comparaStringhe(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        
        // Confronto ignore case e senza spazi ai lati
        if (s1.trim().equalsIgnoreCase(s2.trim())) {
            sb.append("Le due stringhe sono uguali");
        } else {
            sb.append("Le due stringhe sono differenti");
        }
        
        return sb.toString();
    }
}
