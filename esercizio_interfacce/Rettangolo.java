package esercizio_interfacce;
public final class Rettangolo implements Forma {
    protected final double base;
    protected final double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("Area del Rettangolo (non modificabile): " + area);
    }
}