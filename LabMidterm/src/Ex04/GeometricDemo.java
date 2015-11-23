package Ex04;

public class GeometricDemo {
    public static void main(String args[]) {
        GeometricFigure figures[] = {new Triangle(1,2), new Rectangle(1,2)};
        for(GeometricFigure figure : figures ) {
            System.out.println(figure.getClass() + " with area: " + figure.getArea());
        }
    }
}
