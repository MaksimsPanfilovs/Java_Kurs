package homework_14;
/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

 * равны ли переменные,
 * не равны ли они,
 * больше ли a, чем b,
 * и меньше ли b, чем a.

Выведите результат на экран.
 */
public class Home14Task02 {
    public static void main(String[] args) {

        int num1 = 32;
        int num2 = 67;

        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));

        System.out.println();
        num2 = -10;

        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
    }
}
