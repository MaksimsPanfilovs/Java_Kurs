package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLockal {
    public static void main(String[] args) {

        String data = "3,14 42,7";
        Scanner sc = new Scanner(data);
        sc.useLocale(Locale.GERMAN);
        //scanner.useLocale(Locale.US);

        // Locale - используется локаль вашей системы для определения формата чиселю
        // В том числе каким знаком отделяеться дробная часть числа

        // Local.US - дробная часть отделяется точкой (.)
        // Local.GERMANY - дробная часть отделяется запятой (,)

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());
        System.out.println(Locale.getDefault());


        System.out.println("\n==============\n");

        String text = "42 ,Java,3.14  , Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
        //scanner.useLocale(Locale.GERMAN);
//        scanner.useDelimiter(",");
//        scanner.useDelimiter("[;|]"); // Разделитель ; или |

        scanner.useDelimiter("\\s*,\\s*"); // Разделитель ; или |

        System.out.println(scanner.nextInt());
        String java = scanner.next(); // считает ОДИН токен, возвращает String - строку
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());

        scanner.reset(); // вернуться к стандартному разделителю

    }
}
