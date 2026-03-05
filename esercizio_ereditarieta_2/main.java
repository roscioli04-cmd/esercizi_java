public class main {
    public static void main(String[] args) {
        Forma formaGenerica = new Forma();
        // Creiamo un rettangolo con base 5.0 e altezza 10.0
        Rettangolo mioRettangolo = new Rettangolo(5.0, 10.0);

        System.out.print("Test Forma: ");
        formaGenerica.calcolaArea();

        System.out.print("Test Rettangolo: ");
        mioRettangolo.calcolaArea();
    }
}