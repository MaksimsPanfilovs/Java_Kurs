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
}
