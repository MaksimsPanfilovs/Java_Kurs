package homework_17;

/*
Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)

P.S. А почему вы решили, что число может прийти только положительное? ;)
 */
public class Home17Task03 {
    public static void main(String[] args) {
        numberInPow(3);


    }



    public static int numberInPow(int powValue) {
        int value = 2;
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result *= value;

        }
        System.out.println(result);
        return result;
    }


}
