package lessons.lesson_24;

public class MathUtil {

    public static int sumInteger(int... integers) {
        int sum = 0;
        for (int i = 0; i <integers.length; i++) {
            sum += integers[i];

        }
        return sum;
    }
}
