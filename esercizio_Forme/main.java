package esercizio_Forme;
public class main {
    public static void main(String[] args) {
        Forma formaGenerica = new Forma("Generica");
        Rettangolo mioRettangolo = new Rettangolo(10.0, 5.0);
        Triangolo mioTriangolo = new Triangolo(8.0, 6.0);

        formaGenerica.calcolaArea();
        mioRettangolo.calcolaArea();
        mioTriangolo.calcolaArea();
    }
}