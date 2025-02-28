package homework_16;
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */
public class Home16Task01 {
    public static void main(String[] args) {

        int num = 1;
        int op = 1;

        while (num <= 15){
            op *= num;
            num++;
        }
        System.out.println("Произведение чисел: " + op);
    }
}
