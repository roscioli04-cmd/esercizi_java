package esercizio_enum;

public class Triangolo extends Forma {
    private final double base;
    private final double altezza;

    public Triangolo(double base, double altezza) {
        super(TipoForma.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}