package lesson_17;

public class MetodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();
        sayHello();

        char ch = 'A';

        printDecimalCodeOfChar(ch);
        char anotherChar = 'B';
        printDecimalCodeOfChar(anotherChar);
        printDecimalCodeOfChar('6');


        int[] array = {1, 45, 76, 54, 980, 435, 9, 0};
        printArray(array);
        int[] array2 = {1, 2, 3, 4, 5, 56, -100, 0, 43, 6565, 43, 545, 45};
        printArray(array2);


        array[3] = 1001;
        array[0] = -100_000;
        printArray(array);


        String[] strings = {"Hello", "Java", "Test", "World"};
        printArray(strings);


        testParameterOrder(1, "Hello!");
        testParameterOrder("JAva", 200);

    } // Method area (место написания методов)

    /*
    Перегрузка методов

    Впределах одного класса может быть два и более методов с одинаковым именем
    но разным набором параметров (тип и порядок параметров имеет значение
     */

    public static void testParameterOrder(int x, String str){
        System.out.println("INT + STRING  " + x + " | " + str);
    }


    public static void testParameterOrder(String string, int y){
        System.out.println("Другое поведение  " + string + " | " + y);
    }

    // Метод "красиво" выводящий все элементы массива CТРОК
    public static void printArray(String[] strings){
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));

        }
    }



    // Метод "красиво" выводящий все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {  // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? " , " : "]\n"));

        }
    }

    public static void printDecimalCodeOfChar(char ch1) {
        // char ch1 = ch (из аргумента вызова) - условно выполняемая строка при вызове метода (перед началом работы метода)
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        // Тело метода
        System.out.println("Hello World!");
    }

} // end class
