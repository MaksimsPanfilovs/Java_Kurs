package lessons.lesson_39;

public class RainbowConsole {

    private final static String COLOR_BLACK = "\u001B[0m";

    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_BLUE = "\u001B[34m";
    public static final String COLOR_PURPLE = "\u001B[35m";
    public static final String COLOR_CYAN = "\u001B[36m";

    public static final String COLOR_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(COLOR_RED + "Это строка написана красным");
        System.out.println("Тоже красное!" + COLOR_RESET);

        System.out.println("Цвет по умолчанию!");

        System.out.println(COLOR_PURPLE + "Пурпурный" + COLOR_YELLOW + "а теперь желтый");
    }
}
