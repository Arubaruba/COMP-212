/**
 * A rect with only the size and a global color for all instances
 */
public class Rect {
    private double width = 1, height = 1;
    private static String color = "white";

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
        return Rect.color;
    }

    public static void setColor(String color) {
        Rect.color = color;
    }

    /**
     * Initializes a 1x1 rect
     */
    Rect() {}

    Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return the Area
     */
    public double getArea() {
        return width * height;
    }

    /**
     * @return the Perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
