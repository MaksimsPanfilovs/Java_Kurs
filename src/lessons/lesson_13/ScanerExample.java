package lesson_13;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {

        // Строка подготавливает программу для чтения данных из стандартного потока ввода
        // от пользователя через клавиатуру

        Scanner scanner = new Scanner(System.in);


        // Прочитать строку
        System.out.println("Введите ваш имя: ");
        // Читает всю строку введёную пользователем - и возвращает её в виде String
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);


        // Прочитать число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // Считает одно число типа int
        //Всегда после вызова методов next.Int, next.Double, next() и т. п.
        //следует вызвать метод nextLine(), чтобы "скушать" остаток строки
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введи город:");
        String city = scanner.nextLine();
        System.out.println("City: " + city);


        // Todo Чтение токенами чисел

        // Разделитель - пробельный символ
        /*
        \s+ - пробельный символ
        - пробел (в любом количестве подряд)
        - знак табуляции (подряд)
        - перевод каретки (\n)

         */

        System.out.println("Введите число PI: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("PI: " + pi);




    }
}
