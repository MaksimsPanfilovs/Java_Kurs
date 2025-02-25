package homework_14;

import com.sun.jdi.CharValue;
import com.sun.jdi.Value;

import java.util.Scanner;

/*
Task 6 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class Home14Task06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите четырехзначное число: ");
        String number = sc.nextLine();

        Character num1 = number.charAt(0);
        Character num2 = number.charAt(1);
        Character num3 = number.charAt(2);
        Character num4 = number.charAt(3);

        char n1 = num1.charValue();
        char n2 = num2.charValue();
        char n3 = num3.charValue();
        char n4 = num4.charValue();


        int summ1 = n1 + n2;
        int summ2 = n3 + n4;



        if (number.length() != 4) {
            System.out.println("Ошибка !!!!");
        } else if (summ1 == summ2) {
            System.out.printf("Число %s -> (%s+%s) = %d; (%s+%s) = %d; %d равно %d - число счастливое.\n", number, num1, num2, summ1, num3, num4, summ2, summ1, summ2);

        } else {
            System.out.printf("Число %s -> (%d+%d) = %d; (%d+%d) = %d; %d не равно %d - число НЕ является счастливым.\n", number, num1, num2, summ1, num3, num4, summ2, summ1, summ2);

        }


    }
}
