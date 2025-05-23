package homeworks.homework_45;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.

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
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("\n Option 1: " + frequencyDictionary(text));
        System.out.println("\n Option 2: " + frequencyDictionary2(text));
        System.out.println("\n Option 3: " + frequencyDictionary3(text));
        System.out.println("\n Option 4: " + frequencyDictionary4(text));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
        Map<Character, Integer> frequencyCharsMap2 = frequencyCharsDictionary2(text);

//        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
//        System.out.println();
//        frequencyCharsMap2.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
         /*
        1. Поместить в какую-то коллекцию символы из текста
        2. Создать карту вхождений слов -> символ : кол-воВхождений
        3. Перебирать кол-цию символов: Проверять
            Если символ есть - обновить значение (староеЗначение + 1)
            Если символа нет - добавить в карту новую пару ключ-символ со значением 1
         */

        Map<Character, Integer> result = new HashMap<>();

        // Возвращает массив символов, из которых состоит строка.
//        char[] chars = text.toCharArray();
//        System.out.println(Arrays.toString(chars));

        for (Character ch : text.toCharArray()) {

            // map.put(ch, 1) если такого ключа в мапе еще нет.
            // такой ключ. put(ch, 1000) результатРаботыФункции)
            result.merge(ch, 1, (oldValue, newValue) -> oldValue + 1);
        }
        return result;
    }

    private static Map<Character, Integer> frequencyCharsDictionary2(String text) {
         /*
        1. Поместить в какую-то коллекцию символы из текста
        2. Создать карту вхождений слов -> символ : кол-воВхождений
        3. Перебирать кол-цию символов: Проверять
            Если символ есть - обновить значение (староеЗначение + 1)
            Если символа нет - добавить в карту новую пару ключ-символ со значением 1
         */

        Map<Character, Integer> result = new HashMap<>();

        // Возвращает массив символов, из которых состоит строка.
//        char[] chars = text.toCharArray();
//        System.out.println(Arrays.toString(chars));

        for (Character ch : text.toCharArray()) {

            // put(ch, результатРаботыФункции) - выполнится метод
            // get(ch)
            // (ключ, значение) ->
            // 1. old == null ? ключа еще не было (или ключ был, но значение null) -> put(ch, 1)
            // 2. Иначе (old != null) - put(ch, oldV + 1)

            result.compute(ch, (key, oldV) -> oldV == null ? 1 : oldV + 1);
        }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста.
        2. Создать карту вхождений слов -> Слово : кол-во Вхождений.
        3. Перебрать кол-цию слов: Проверять
            Если слово есть - обновить значение (староеЗначение + 1).
            Если слова нет - добавить в карту новую пару ключ-слово со значением 1.
         */

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебираю слова
        for (String word : words) {
            // Пытаюсь получить значение, ассоциированное текущему слову / ключу.
            Integer amount = result.get(word);
            // Если такого ключа нет - вернется null.
            if (amount == null) amount = 0;
            // Увеличиваю значение на 1.
            amount = amount + 1;
            // Записать в карту новую пару или обновить значение.
            result.put(word, amount);
        }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary2(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебирая слова
        for (String word : words) {

            // Попытаюсь получить значение, ассоциированное текущему слову / ключу
            // Если ключа не было - вернется null и в переменную amount будет присвоен

            Integer amount = result.getOrDefault(word, 0);

            result.put(word, ++amount);
        }
        return result;
    }

    // Методы merge, compute - Методы используются для вычисления новых значений в карте
    // на основе ключа и текущего значения

    public static Map<String, Integer> frequencyDictionary3(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
            Метод compute позволяет вычислить новое значение ключа, используя функцию пересчета
            Новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то пара с текущим ключом удаляется из карты
             */
            // key = word;
            // oldValue = result.get(word);
            // oldValue == null -> put(word, 1) : put(word, oldValue + 1)
            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : null);

        }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary4(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            /*
            compute(K key, BiFunction<K, V> remappingFunction)
            Метод compute позволяет вычислить новое значение ключа, используя функцию пересчета
            Новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то пара с текущим ключом удаляется из карты
             */

            // computeIfPresent() -  вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциировано какое-то не-null значение.
            // если метод get(key) возвращает не null.
            result.computeIfPresent(word, (key, value) -> value + 1);

            // Метод вычисляет новое значения для ключа, ТОЛЬКО ЕСЛИ ключ не присутствует в карте (или возвращает null).
            // Если метод get(key) возвращает null
            result.computeIfAbsent(word, key -> 1);
            // put(word, 1)
        }
        return result;
    }

    public static Map<String, Integer> frequencyDictionary5(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

             /*
        merge(K key, V newValue, BiFunction<K,V> remappingFunction)
        Метод merge используется для объединения значений по ключу
        Как работает:
            - Если ключа нет (или вернул null), новое пара key:newValue вставляется в карту
            - Если ключ уже существует и вернул не-null применится функция объединения,
            которая может использовать строе и новое значение
         */
            result.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
//       result.merge(word, 1, Integer::sum);

        }
        return result;
    }


}
