class Animale { 
    public void faiIlVerso() { 
        System.out.println("L'animale fa un verso generico."); 
    }
}

// Classe derivata (Sottoclasse) che estende Animale
class Gatto extends Animale { 
    // Override del metodo della superclasse
    @Override 
    public void faiIlVerso() { 
        System.out.println("Il gatto fa: Miao! Miao!"); 
    }
}

public class Main { 
    public static void main(String[] args) {  
        // Istanza della classe base
        Animale generico = new Animale(); 
        System.out.print("Verso di Animale: "); 
        generico.faiIlVerso();
        
        // Istanza della classe derivata
        Gatto mioGatto = new Gatto(); 
        System.out.print("Verso di Gatto: "); 
        mioGatto.faiIlVerso(); 
    }
}