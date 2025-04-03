package homeworks.homework_35.rect;

import lists.MyList;

public class RectangleUtils {

    public static void removeDuplicates(MyList<Rectangle> list, Rectangle rectangle) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeDuplicates2(MyList<Rectangle> list, Rectangle rectangle) {
        while (list.remove(rectangle)) {
            // пустое тело
        }

//        while (list.contains(rectangle)) {
//            list.remove(rectangle);
//        }
    }
}
