package homeworks.homework_25;

public class Home25Main {
    public static void main(String[] args) {

        System.out.println(ClaculatorHome25.circleLenght(15));

        System.out.println(ClaculatorHome25.circleArea(25));

        ImmutablePoint dig = new ImmutablePoint(5, 15);

//        dig.setX(10);

//        System.out.println(dig.setX(10));

        System.out.println(dig.getX());
        System.out.println(dig.getY());


    }
}
