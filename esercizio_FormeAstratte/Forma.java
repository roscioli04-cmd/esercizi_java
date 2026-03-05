public abstract class Forma {
    private String tipo;

    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void calcolaArea();
}