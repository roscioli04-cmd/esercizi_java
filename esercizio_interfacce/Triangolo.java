package esercizio_interfacce;
public final class Triangolo implements Forma {
    protected final double base;
    protected final double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("Area del Triangolo (non modificabile): " + area);
    }
}