public class DebugCircle {
    private int radius;
    private int diameter;
    private double area;

    public DebugCircle(int r) {
        setRadius(r);
    }

 
    public void setRadius(int r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        radius = r;
        diameter = 2 * r;
        area = Math.PI * r * r;
    }

    public int getRadius() {
        return radius;
    }

    
    public int getDiameter() {
        return diameter;
    }


    public double getArea() {
        return area;
    }
}
