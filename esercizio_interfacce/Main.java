package esercizio_interfacce;
public class Main {
    public static void main(String[] args) {
        final Forma rettangolo = new Rettangolo(10.0, 5.0);
        final Forma triangolo = new Triangolo(8.0, 4.0);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}