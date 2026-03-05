public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10.0, 5.0);
        Triangolo triangolo = new Triangolo(8.0, 4.0);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}