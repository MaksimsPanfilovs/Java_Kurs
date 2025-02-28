package homework_13;

import java.util.Scanner;

/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
public class Home13Task03 {
    public static void main(String[] args) {

        Scanner entr = new Scanner(System.in);

        System.out.println("Введит строку чётной длины: ");
        String str = entr.nextLine();


        char symb1 = str.charAt((str.length() / 2) - 1);
        char symb2 = str.charAt(str.length() / 2);

        System.out.println("Avereg symbols: " + symb1 + "" + symb2);


    }
}
