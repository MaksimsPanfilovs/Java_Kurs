package homework_15;
/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
import java.util.Scanner;

public class Home15Task03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String number = sc.nextLine();

        char num1 = number.charAt(0);
        char num2 = number.charAt(1);
        char num3 = number.charAt(2);
        char num4 = number.charAt(3);

        int int_num1 = Integer.parseInt(String.valueOf(num1));
        int int_num2 = Integer.parseInt(String.valueOf(num2));
        int int_num3 = Integer.parseInt(String.valueOf(num3));
        int int_num4 = Integer.parseInt(String.valueOf(num4));

        int summ1 = int_num1 + int_num2;
        int summ2 = int_num3 + int_num4;


        if (number.length() != 4) {
            System.out.println("Ошибка !!!!");
        } else if (summ1 == summ2) {
            System.out.printf("Число %s -> (%s+%s) = %d; (%s+%s) = %d; %d равно %d - число счастливое.\n", number, num1, num2, summ1, num3, num4, summ2, summ1, summ2);

        } else {
            System.out.printf("Число %s -> (%s+%s) = %d; (%s+%s) = %d; %d не равно %d - число НЕ является счастливым.\n", number, num1, num2, summ1, num3, num4, summ2, summ1, summ2);

        }


        System.out.println("\n========= Вариант учителя ==========\n");



        if (number.length() != 4){
            System.out.println("Сообщение о ошибке");
        }else {

            // 0...9 -> 48...57

            // Логика обработки этой строки
            int dig1 = number.charAt(0) -'0';
            int dig2 = number.charAt(1) - 48;

            if (number.charAt(0) + number.charAt(1) == number.charAt(2) + number.charAt(3)){
                System.out.println("число счастливое");
            }else {
                System.out.println("число НЕ является счастливым");
            }

        }

        System.out.println("\n================== opt2 =============\n");

        if (number.length() == 4) {
            int input = Integer.parseInt(number);
            System.out.println("Я получил число из строки: " + input);

            // 1234
            int digit3 = input % 10;
            input = input / 10;

            // 123
            int digit2 = input % 10;
            input = input / 10;

            //12
            int digit1 = input % 10;
            int digit0 = input / 10;

            String resutlt = (digit0 + digit1 == digit2 + digit3) ? " счастливое" : " НЕ  счастливым";

            System.out.printf("Число %s -> (%d+%d) = %d; (%d+%d) = %d; - число %s",
                    number, digit0, digit1, digit0 + digit1, digit2, digit3, digit2 + digit3, resutlt);

        }else {
            System.out.println("Длина строки не 4 символа");
        }






    }
}
