public class Forma {
    private String tipo;

    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void calcolaArea() {
        System.out.println("Area della forma " + tipo + ": non definita.");
    }
}