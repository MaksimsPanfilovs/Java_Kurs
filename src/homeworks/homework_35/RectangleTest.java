package homeworks.homework_35;

import lessons.lesson_32.methods.Utils;
import lists.MyArrayList;
import lists.MyList;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle RectangleUtils = new Rectangle();

        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(6, 8);
        Rectangle rect3 = new Rectangle(10, 5);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        System.out.println(rect3.toString());

        System.out.println(rect1.equals(rect2)); // false
        System.out.println(rect1.equals(rect3)); // true

        MyList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(rect1);
        rectangles.add(rect2);
        rectangles.add(rect3);
        rectangles.add(new Rectangle(8, 6));
        rectangles.add(new Rectangle(10, 5));
        System.out.println("\n===================");

        System.out.println("Список до удаления дубликатов");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }







    }
}
