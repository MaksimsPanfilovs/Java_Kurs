package homeworks.homework_45;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
 */
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
//        System.out.println("\n Option 1: " + frequencyDictionary(text));
//        System.out.println("\n Option 1: " + frequencyDictionary2(text));
//        System.out.println("\n Option 1: " + frequencyDictionary3(text));
//        System.out.println("\n Option 1: " + frequencyDictionary4(text));
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

//        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    public static Map<String, Integer> frequencyDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста.
        2. Создать карту вхождений слов -> Слово : кол-во Вхождений.
         */

        String[] words = text.replaceAll("[a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {
            //
            Integer amount = result.get(word);

            //
            if (amount == null) amount = 0;

            //
            amount = amount + 1;

            //
            result.put(word, amount);
         }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary2(String text) {

        String[] words = text.replaceAll("[a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            Integer amount = result.getOrDefault(word, 0);

            result.put(word, ++amount);
        }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary3(String text) {

        String[] words = text.replaceAll("[a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
             */
            // key = word;
            // oldValue = result.get(word);
            // oldValue == null -> put(word, 1) : put(word, oldValue + 1)
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);

        }
        return result;
    }

        public static Map<String, Integer> frequencyDictionary4(String text) {

            String[] words = text.replaceAll("[a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

            Map<String, Integer> result = new HashMap<>();

            for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
             */

                // computeIfPresent() -
                // если метод get(key) возвращает не null.
                result.computeIfPresent(word, (key, value) -> value + 1);

                // Метод вычесляет новое значение
                result.computeIfAbsent(word, key -> 1);
            }
            return result;
        }



}
