package homeworks.homework_29.shapes;

public class Circle extends Schape {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) return;
        this.radius = radius;
    }

    @Override
    public double area() {
        // PI * radius^2;
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // Длина окружности
        // 2 * PI * radius (PI * d)
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
