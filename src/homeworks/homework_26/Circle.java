package homeworks.homework_26;

public class Circle extends Shape {

    public static final double PI = 3.141519;
    private double r;

    public Circle(String name, String color) {
        super(name, color);
    }

    public void setRadius(double r) {
        this.r = r;
        System.out.printf("Фигура - %s: радиусом = %.2f\n",
                name, r);
    }

    public double CalculateArea() {
        double area = 2 * PI * r;
        System.out.println("Площадь фигуры - " + name + " = " + area);
        return area;
    }

    public double getR() {
        return r;
    }

    public void setR(double radius) {
        this.r = radius;
    }
}
