package esercizio_coordinate;

class Punto {
    private final int x;
    private final int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{x=" + x + ", y=" + y + "}";
    }
}

public class main {
    public static void main(String[] args) {
        Punto p = new Punto(10, 20);
        
        System.out.println("Coordinate del punto:");
        System.out.println("X: " + p.getX());
        System.out.println("Y: " + p.getY());
        System.out.println("Oggetto completo: " + p);
    }
}