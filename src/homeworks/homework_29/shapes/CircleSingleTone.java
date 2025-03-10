package homeworks.homework_29.shapes;

public class CircleSingleTone extends Schape {

    private static CircleSingleTone instance;

    public double radius;

    private CircleSingleTone(double radius) {
        this.radius = radius;
    }

    public static CircleSingleTone getCircle(double radius){
        if (radius < 0) return null;
        return new CircleSingleTone(radius);
    }

    //    // Классический SingleTone
//    public static CircleSingleTone getInstance(double radius) {
//
//        if (instance == null) {
//            instance = new CircleSingleTone(radius);
//        }
//
//        return instance;
//    }

//    public CircleSingleTone(double radius) {
//        if (radius < 0) return;
//        this.radius = radius;
//    }

    @Override
    public double area() {
        // Pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // Длина окружности
        // 2 * PI * r (PI * d)
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
        return "Circle {" +
                "radius=" + radius +
                '}';
    }


}
