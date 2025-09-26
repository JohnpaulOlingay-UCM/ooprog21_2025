public class DebugPen {
    private String color;
    private String point;

   
    public DebugPen() {
        this.color = "black";
        this.point = "fine";
    }

   
    public DebugPen(String color, String point) {
        this.color = color; 
        this.point = point; 
    }

    public String getColor() {
        return this.color;
    }

    public String getPoint() {
        return this.point;
    }
}
