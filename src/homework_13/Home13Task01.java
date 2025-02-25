package homework_13;

import java.util.Scanner;

/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
public class Home13Task01 {
    public static void main(String[] args) {

        Scanner entr = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = entr.nextLine();
        System.out.println("Имя состоит: " + name.length());

        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);

        System.out.printf("Первая буква: %d, Вторая буква: %d", (int) first, (int) last);


    }
}
