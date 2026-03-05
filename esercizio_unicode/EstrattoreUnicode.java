package esercizio_unicode;

public class EstrattoreUnicode {
    private String testo;
    private int posizione;

    public EstrattoreUnicode(String testo, int posizione) {
        this.testo = testo;
        this.posizione = posizione;
    }

    public String ottieniRisultatoUnicode() {
        StringBuilder sb = new StringBuilder();

        if (testo != null && posizione >= 0 && posizione < testo.length()) {
            int unicodeVal = testo.codePointAt(posizione);
            
            sb.append("Il carattere all'indice ")
              .append(posizione)
              .append(" ha valore Unicode: ")
              .append(unicodeVal);
        } else {
            sb.append("Errore: Indice ")
              .append(posizione)
              .append(" non valido per la stringa fornita.");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        EstrattoreUnicode es1 = new EstrattoreUnicode("Java", 2);
        System.out.println(es1.ottieniRisultatoUnicode());

        EstrattoreUnicode es2 = new EstrattoreUnicode("Java", 10);
        System.out.println(es2.ottieniRisultatoUnicode());
    }
}