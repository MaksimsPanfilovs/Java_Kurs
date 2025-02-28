package lesson_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита.
        char a1 = 65; // Переменная будет хранить букву A латинского алфавита. (символ соответствующий коду 65 в десятичной СС)
        char a2 = 0x41; // при сваиваю число в 16-формате без ведущих нулей. Что соответсвует всё той же букве А.
//           a2 = 0x0041;
        char a3 = '\u0041'; // Ещё один способ задать код в 16-формате
        char x = '\u15EE';

        // [] 0...9 ABCDEF
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        System.out.println("\n=================\n");


        char letter = 'A';
        letter++;  // Увеличиваю код символа, который хранится в переменной.
        System.out.println("letter: " + letter);


        char digit = 48; // Код 49 соответсвует символ 0 (ноль).
        System.out.println("digit " + digit);

        digit += 5; // digit = digit + 5;
        System.out.println("digit " + digit);

        /*
        0....9 -> соответсвует кодам 48....57
        a....z -> соответсвует кодам 97....122
        A....Z -> соответсвует кодам 65....90
         */


        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 1);

        // Чтобы получить код символа в 10-ти СС нужно привести тип char к типу int
        System.out.println("int из char даст 10-й код символа: " + (int) digit);
        System.out.println(0 + digit);

        char x1 = 12853;
        System.out.println("x1 : " + x1);

    }
}
