package homework_14;

import java.util.Scanner;

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:

Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false

Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
public class Home14Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = sc.nextInt();
        sc.nextLine();

        boolean ever = number % 2 == 0;
        boolean divis = number % 3 == 0;
        boolean comp = ever & divis;

        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n", number, ever, divis, comp);

    }
}
