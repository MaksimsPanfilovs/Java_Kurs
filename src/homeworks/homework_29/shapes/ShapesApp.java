package homeworks.homework_29.shapes;

public class ShapesApp {
    public static void main(String[] args) {

        Circle circle = new Circle(-10);
        System.out.println(circle);

        Schape[] schapes = new Schape[4];
        schapes[0] = new Circle(10);
        schapes[1] = new Rechtangle(10, 20);
        schapes[2] = new Triangle(3, 4,5);
        schapes[3] = new Triangle(5, 6, 18);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < schapes.length; i++) {
            double area = schapes[i].area();
            double perimeter = schapes[i].perimeter();
            System.out.printf("%s площадь: %.2f; периметр: %.2f\n",
                    schapes[i].getClass().getSimpleName(), area, perimeter);
            sumArea += schapes[i].area();
            sumPerimeter += schapes[i].perimeter();
            System.out.println("==================== \n");
        }

        System.out.printf("Сумма площадей: %.2f\n", sumArea);
        System.out.printf("Сумма перимктров: %.2f\n", sumPerimeter);

        System.out.println("==================== \n");

        // Невозможно создать объект - нет публичных конструкторов
        // CircleSingleTone singleTone = new CircleSingleTone();

        // не будет создан объект Circle - вернется null
        CircleSingleTone single = CircleSingleTone.getCircle(-5);

        System.out.println(single);

        CircleSingleTone circleSingle = CircleSingleTone.getCircle(5);

        System.out.println(circleSingle);


    }
}
