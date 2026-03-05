package esercizio_enum;

public class Forma {
    protected final TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public void calcolaArea() {
        System.out.println("Area della forma " + tipo + ": non definita.");
    }
}