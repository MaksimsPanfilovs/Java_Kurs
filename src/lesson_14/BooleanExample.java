package lesson_14;

public class BooleanExample {

    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        // Сравнение на равенство ==
        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1);


        // Не равенство !=
        // x не равен y
        b1 = x != y; // X не равен Y -> 10 не равно 5 -> true
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // Больше >
        b1 = x > y; // X больше Y -> 10 больше 5 -> true
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        y = 10;
        b1 = x > y; // X больше Y -> 10 больше 10 -> false
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // Больше или равно >=
        b1 = x >= y; // X больше или равно Y -> 10 больше или равно 10 -> true
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // Меньше
        x = 7;
        b1 = x < y; // X меньше Y -> 7 меньше 10 -> true
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        // Меньше или равно
        b1 = x <= y; // X меньше или равно Y -> 7 меньше или равно 10 -> true
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        String str = "Java is the best";
        // Поиск вхождения подстроки
        // contains - возвращает true если строка содержит указанную последовательность символов (подстроку).

        boolean contains = str.contains("Java"); // строка str содержит последовательность символов "Java".
        System.out.println("str.contains(\"Java\"):" + contains);
        System.out.println("str.contains(\"java\"):" + str.contains("java"));

        // startsWith(), endsWith() - начинаеться / оканчивается строка на указаную подстроку.
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.startsWith(\"Ja\"): " + startsWith);
        System.out.println("str.startsWith(\"ava\"): " + str.startsWith("ava"));

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(\"best\"): " + endsWith);
        System.out.println("str.endsWith(\"ava\"): " + str.endsWith("ava"));

        // Rename -> Shift + F6

        System.out.println("\n====== Логические операции =========\n");

        // Логическое НЕ (отрицание) "!"
        // Меняет значение типа boolean на противопаложное
        boolean b2 = !false; // !false -> true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); // !false -> true
        System.out.println("!(4 == 5): " + b2);

        // Составные операции - два условия

        /*
        Логическое И "&"
        Используется когда нужно, чтобы оба условия были истинными.
        Возвращает true, если оба условия true.
        Если хотя бы в одной части будет false -> в результате получим false
         */

        b2 = true & true;
        System.out.println("true & true: " + b2); //true
        System.out.println("true & false: " + (true & false)); // false
        System.out.println("false & true: " + (false & true)); // false
        System.out.println("false & false: " + (false & false)); // false

        // Проверка, что число входит в нужный диапозон
        // Введите число от 0 до 100

        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);

        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);

        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы ХОТЯ бы одно условие было истинно
        b2 = true | true;
        System.out.println("true | true: " + b2); // true
        System.out.println("true | false: " + (true | false)); // true
        System.out.println("false | true: " + (false | true)); // true
        System.out.println("false | false: " + (false | false)); // false


        System.out.println("\n============\n");

        // Логическое исключающее ИЛИ (XOR) "^"
        // Возвращает true, если две части выражения разные

        b2 = true ^ true;
        System.out.println("true ^ true: " + b2); // false, две части разные
        System.out.println("true ^ false: " + (true ^ false)); // true
        System.out.println("false ^ true: " + (false ^ true)); // екгу
        System.out.println("false ^ false: " + (false ^ false)); // false


        // Логическое сокращенной И "&&"
        // Выдаёт true, только если обе части выражения возвращают true.

        b2 = true && true;
        System.out.println("true && true: " + b2); //true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && true: " + (false && true)); // false
        System.out.println("false && false: " + (false && false)); // false

        int a = 10;
        int b = 0;

        // b = 0; 0 != 0 -> false
        // false && ? -> false
        // b = 100 -> 100 != 0 -> true -> true && ? -> НАДО считать правую часть

        boolean bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol);
        // Даже если правая часть никак не влияет на конечный результат, при использовании & она будет вычеслина.
//        boolean bolFull = (b != 0) & (a / b > 2);
//        System.out.println("bolFull: " + bolFull);

        b = 1;
        bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol);


        // Логическое сокращённое ИЛИ "||"
        // Когда достаточно, чтобы ХОТЯ бы одно условие было истинно

        // true || ? -> true (независимо от значения правой части)
        // сокращенное ИЛИ НЕ будет считать правую часть, а обычное ИЛИ будет считать
        b = 0;
        bol = true || (a / b > 2);
        System.out.println("bol ||: " + bol);


        System.out.println("/n====== Приоритет логических операций =======\n");

        //  ! & ^ | && || - приоритет логических операций

        System.out.println(true ^ true & false); //true
        System.out.println(true ^ false); // true
        System.out.println(true); // true

        System.out.println();

        System.out.println(true ^ true && false); // false
        System.out.println(false && false); // false
        System.out.println(false); // false









    }
}
