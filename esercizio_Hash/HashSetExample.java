package esercizio_Hash;
import java.util.HashSet;

public class HashSetExample {

    public static HashSet<String> creaSetNomi() {
        HashSet<String> nomi = new HashSet<>();
        nomi.add("Marco");
        nomi.add("Lucia");
        nomi.add("Giulia");
        return nomi;
    }

    public static void main(String[] args) {
        HashSet<String> setNomi = creaSetNomi();

        String nuovoNome = "Marco";

        boolean esiste = setNomi.contains(nuovoNome);

        System.out.println("L'elemento '" + nuovoNome + "' è nel Set? " + esiste);
    }
}