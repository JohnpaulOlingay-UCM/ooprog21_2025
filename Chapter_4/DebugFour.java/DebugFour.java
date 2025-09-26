public class DebugCircle {
    private double radius;
    private final double PI = 3.14159;

    public DebugCircle(double r) {
        radius = r;
    }

    public double getRad() {
        return radius;
    }

    public double getDiam() {
        return radius * 2;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
