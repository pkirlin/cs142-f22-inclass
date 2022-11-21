package poly3;

import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(sq);
        shapes.add(tri);
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        System.out.println("Your total area is " + totalArea);
    }
}
