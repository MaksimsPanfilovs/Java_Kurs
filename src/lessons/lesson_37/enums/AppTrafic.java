package lessons.lesson_37.enums;

public class AppTrafic {
    public static void main(String[] args) {

        Colors color = Colors.RED;
        System.out.println("color = " + color);

        Colors[] colors = Colors.values(); // получаю массив всех значений enum

        for (Colors current : Colors.values()) {
            System.out.println(current);
        }

        // возвращает константу Enum по указанному имени (строке).
        Colors red = Colors.valueOf("RED");

        // Enum безопасно сравнивать оператором == (не обязательно использовать equals() ).
        System.out.println("color == Colors.RED: " + (color == Colors.RED));

        // У каждой константы есть порядковый номер (начиная с 0)
        System.out.println(color.ordinal());




        TraficsLight traficsLight =
                new TraficsLight("SN-001", "Berlin",
                        Colors.YELLOW);
        System.out.println(traficsLight);






    }
}
