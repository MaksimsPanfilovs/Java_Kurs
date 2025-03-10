package homeworks.homework_29.shapes;

public class Rechtangle extends Schape {

    private double sideA;
    private double sideB;

    public Rechtangle(double sideA, double sideB) {
        if (sideA < 0 || sideB < 0) return;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rechtangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}
