package homework_18;

import java.util.Arrays;

/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Home18Task02 {
    public static void main(String[] args) {
        String[] strings = {"One", "Java", "Python", "Js", "Hallo"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("/n======== null in Array ==============\n");
        strings = new String[]{"One", "Java", "Python", null, "Js", "Hallo"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("/n======== null in Array is first ==============\n");
        strings = new String[]{null, "One", "Java", "Python", null, "Js", "Hallo"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

    }//Method area

    public static String[] getArrayWithSmallestStrings(String[] strings) {
        if (strings == null || strings.length == 0){
            return new String[0]; // []
        }
        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNullValue: " + notNullValue);
        if (notNullValue == null){
            // весь массив забит null
            System.out.println("Not-Null not found in array");
            return new String[0]; // []
        }

//        String smallest = strings[0];
//        String bigest = strings[0];
        String smallest = notNullValue;
        String bigest = notNullValue;

        for (int i = 0; i < strings.length; i++) {

            if (strings[i] == null) continue;

            if (strings[i] != null && strings[i].length() < smallest.length()){
                smallest = strings[i];
            }
            if (strings[i] != null && strings[i].length() > bigest.length()){
                bigest = strings[i];
            }
        }
        return new String[]{smallest, bigest};

    }

    private static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];


        }
        return null;
    }


}//End class
