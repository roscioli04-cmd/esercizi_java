package esercizio_StringBuilder;

public class Main {
    public static void main(String[] args) {
        Comparatore comp = new Comparatore();
        
        String testo1 = "Java";
        String testo2 = "java "; // Notare lo spazio e la minuscola
        
        System.out.println("Risultato: " + comp.comparaStringhe(testo1, testo2));
    }
}
