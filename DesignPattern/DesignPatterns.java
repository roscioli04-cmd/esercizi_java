package DesignPattern;

public class DesignPatterns {

    public interface Shape {
        void draw();
    }

    public enum ShapeType {
        CERCHIO,
        RETTANGOLO,
        TRIANGOLO
    }

    public static class Cerchio implements Shape {
        @Override
        public void draw() {
            System.out.println("Sto disegnando un Cerchio");
        }
    }

    public static class Rettangolo implements Shape {
        @Override
        public void draw() {
            System.out.println("Sto disegnando un Rettangolo");
        }
    }

    public static class Triangolo implements Shape {
        @Override
        public void draw() {
            System.out.println("Sto disegnando un Triangolo");
        }
    }

    public static class ShapeFactory {
        public static Shape getShape(ShapeType type) {
            switch (type) {
                case CERCHIO:
                    return new Cerchio();
                case RETTANGOLO:
                    return new Rettangolo();
                case TRIANGOLO:
                    return new Triangolo();
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape(ShapeType.CERCHIO);
        Shape s2 = ShapeFactory.getShape(ShapeType.RETTANGOLO);
        Shape s3 = ShapeFactory.getShape(ShapeType.TRIANGOLO);

        if (s1 != null) s1.draw();
        if (s2 != null) s2.draw();
        if (s3 != null) s3.draw();
    }
}