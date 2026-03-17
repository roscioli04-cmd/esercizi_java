package esercizio_Hash;

import java.util.HashSet;
import java.util.Iterator;

public class EsercizioHashSet {
    
    public static HashSet<Integer> creaSetNumeri() {
        HashSet<Integer> numeri = new HashSet<>();
        numeri.add(10);
        numeri.add(20);
        numeri.add(30);
        return numeri;
    }

    public static void main(String[] args) {
        try {
            HashSet<Integer> mioSet = creaSetNumeri();
            Integer numeroDaConfrontare = 20;

            Iterator<Integer> it = mioSet.iterator();
            while (it.hasNext()) {
                Integer elementoCorrente = it.next();
                if (elementoCorrente.equals(numeroDaConfrontare)) {
                    it.remove();
                    System.out.println("Rimosso: " + elementoCorrente);
                }
            }

            mioSet.clear();

            if (mioSet.isEmpty()) {
                System.out.println("Il Set è vuoto");
            } else {
                throw new ArithmeticException("Il Set non si è svuotato");
            }

        } catch (ArithmeticException e) {
            System.err.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Fine operazioni");
        }
    }
}