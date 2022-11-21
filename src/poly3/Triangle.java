package poly3;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 1.0/2.0 * base * height;
    }
}
