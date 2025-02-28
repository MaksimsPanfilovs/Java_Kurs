package homework_13;

import lesson_13.CharExample;

/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"

Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */
public class Home13Task02 {

    public static void main(String[] args) {

        String a = "Java";
        String b = " is";
        String c = " a";
        String d = " powerful";
        String e = " language";

        String str1 = a + b + c + d + e;
        System.out.println("Первый вариант: " + str1 + "  Длина строки: " + str1.length());


        String str2 = String.join(",",  a, b, c, d, e);
        System.out.println("Второй вариант: " + str2 + "  Длина строки: " + str2.length());


        String replStr = str1.replace("powerful", "super");
        String ag = "age";


        boolean chek = replStr.contains("age");

        System.out.println(replStr);


        System.out.println("Cодержит ли строка подстроку \"age\"?: " + chek);
    }
}
