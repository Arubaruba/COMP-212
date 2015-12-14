package Ex04;

public class Rectangle extends GeometricFigure {
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    double getArea() {
        return width * height;
    }
}
