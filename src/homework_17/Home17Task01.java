package homework_17;
/*
Task 1
Написать метод, принимающий на вход строку.
Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */
public class Home17Task01 {
    public static void main(String[] args) {

        String str = "Hello!!!";
        calculateAmtIndex(str);
    }
    public static void calculateAmtIndex(String string){
        int lenght = string.length();
        System.out.println("Длина строки: " + lenght);

    }
}
