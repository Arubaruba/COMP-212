package Ex04;

public class Triangle extends GeometricFigure {
    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    double getArea() {
        return width * height / 2.0;
    }
}
