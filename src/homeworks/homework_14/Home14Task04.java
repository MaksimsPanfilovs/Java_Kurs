package homework_14;
/*
Task 4
Дан следующий код. Вашей задачей является предсказать,
какой вывод будет напечатан в консоли после выполнения программы.

Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */
public class Home14Task04 {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10; // true -> 11 > 10 -> true
        System.out.println("Result 1: " + result);

        result = (a - b) == 5; // true -> 5 == 5 -> true
        System.out.println("Result 2: " + result);

        result = (a * b) != 24; // false -> 24 != 24 -> false
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2; // true -> 2 >= 2 -> true
        System.out.println("Result 4: " + result);

        result = !(a % b == 2); // false -> 2 == 2 -> true -> ! false
        System.out.println("Result 5: " + result);
    }
}
