package homework_12;
/*
Task 6 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */
public class Home12Task06 {
    public static void main(String[] args) {


        long bigNumber = 15_000_000_000L;
        int smalNumber = (int) bigNumber;

        System.out.println("smallNumber: " + smalNumber);
        System.out.println("longNumber: " + Long.toBinaryString(bigNumber));
        System.out.println("intNumber:     " + Integer.toBinaryString(smalNumber));

        System.out.println(Math.pow(2, 32)); // возведение в степень
        System.out.println(Math.pow(2, 33));
    }
}
