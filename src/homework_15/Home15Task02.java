package homework_15;

import java.util.Scanner;

/*
Task 2
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник",

2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */
public class Home15Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int number = scanner.nextInt();
        scanner.nextLine();

        String day;

        switch (number) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
            case 7:
                day = "Выходной";
                break;
            default:
                day = "Ошибка!!!";

        }

        System.out.println(day);

    }
}
