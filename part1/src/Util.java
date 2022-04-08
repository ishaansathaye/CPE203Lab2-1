package src;

public class Util {
    
    public static double perimeter(Circle circle) {
        return 2*Math.PI*circle.getRadius();
    }

    public static double perimeter(Rectangle rectangle) {
        double side1 = Math.abs(rectangle.getTopLeft().getX() - rectangle.getBottomRight().getX());
        double side2 = Math.abs(rectangle.getTopLeft().getY() - rectangle.getBottomRight().getY());
        return 2*(side1+side2);
    }

    public static double perimeter(Polygon polygon) {
        double polyPerimeter = 0.0;
        return polyPerimeter;
    }
        
}
