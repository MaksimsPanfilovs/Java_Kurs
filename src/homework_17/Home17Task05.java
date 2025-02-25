package homework_17;

import java.util.Arrays;

/*
Task 5 * (Опционально)
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
public class Home17Task05 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Five", "Ten", "Twenty"};
        System.out.println(Arrays.toString(strings));
        String[] result = findArrayWithBigestStrings(strings);
        printStringColumn(result);


    }//Method area

    public static String[] findArrayWithBigestStrings(String[] str) {

        String big = str[0];

        for (int i = 0; i < str.length; i++) {

            if (str[i] == null) continue;

            if (str[i] != null && str[i].length() > big.length()) {
                big = str[i];
            }

        }
        return new String[]{big};
    }



    public static void printStringColumn(String[] strings){

        String max = strings[0];

        for(int i = 0; i < max.length(); i++){
            System.out.println(max.charAt(i));
        }




    }



}//End class
