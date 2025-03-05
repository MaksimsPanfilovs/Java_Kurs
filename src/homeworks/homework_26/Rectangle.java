package homeworks.homework_26;

public class Rectangle extends Shape{

    private double width;
    private double height;


    public Rectangle(String name, String color) {
        super(name, color);
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.printf("Фигура - %s: шириной = %.2f и высотой = %.2f\n",
                name, width, height);
    }

    public double CalculateArea() {
        double area = width * height;
        System.out.println("Площадь фигуры - " + name + " = " + area);
        return area;
    }




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
