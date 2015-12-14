package Ex04;

abstract public class GeometricFigure {
    int height, width;

    public GeometricFigure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    abstract double getArea();
}
