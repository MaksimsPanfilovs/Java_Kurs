package homework_16;

import java.util.Scanner;

/*
Task 3 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 */
public class Home16Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово 'hello': ");
        String greeting = scanner.nextLine();
        String corect = "hello";

        int i = 0;
        while (!greeting.equals(corect)) {
            i ++;
            System.out.println("Неправельный ввод! введите слово 'hello':");
            greeting = scanner.nextLine();
        }
        System.out.println("Спасибо!, правильный ввод!");
        System.out.println("Вы ввели " + i + " раза неправельно!");


    }
}
