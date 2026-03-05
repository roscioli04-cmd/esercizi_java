public class Main {
    public static void main(String[] args) {
        // Istanza della classe base
        Animale mioAnimale = new Animale();
        
        // Istanza della sottoclasse
        Gatto mioGatto = new Gatto();

        // Chiamata dei metodi per verificare l'override
        System.out.print("Verso generico: ");
        mioAnimale.faiIlVerso();

        System.out.print("Verso del gatto: ");
        mioGatto.faiIlVerso();
    }
}
