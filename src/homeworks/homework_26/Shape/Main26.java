package homeworks.homework_26.Shape;

public class Main26 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямой", "red");
        rectangle.setDimension(13, 15);
        rectangle.CalculateArea();

        Circle circle = new Circle("Круглый", "green");
        circle.setRadius(32);
        circle.CalculateArea();

        System.out.println("\n========== info ==========");

        rectangle.displayInfo();
        circle.displayInfo();




    }
}
