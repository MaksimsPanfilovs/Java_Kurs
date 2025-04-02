package homeworks.homework_44;

import java.util.*;

/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке



// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
//        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String string) {
        /*
        1.
        2.
        3.\
        4.
         */
        String[] words = string.replaceAll("[^a-zA-Zа-яА-я0-9 ]","").split("\\s+");

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        uniqueWords.addAll(Arrays.asList(words));

        return new ArrayList<>(uniqueWords);



    }

}
