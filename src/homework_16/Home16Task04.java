package homework_16;

import java.util.Scanner;

/*
Task 4 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27
 */
public class Home16Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String num = scanner.nextLine();

        int i = 0;
        int sum = 0;
        System.out.print(num + " -> ");

        while (i < num.length()){
            char ch = num.charAt(i);
            System.out.print(ch + "+");
            int n = Integer.parseInt(String.valueOf(ch));
            sum += n;
            i++;
        }
        System.out.print("\b -> " + sum);

    }
}
