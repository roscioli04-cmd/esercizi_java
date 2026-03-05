package esercizio_enum;

public class Rettangolo extends Forma {
    private final double base;
    private final double altezza;

    public Rettangolo(double base, double altezza) {
        super(TipoForma.RETTANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}