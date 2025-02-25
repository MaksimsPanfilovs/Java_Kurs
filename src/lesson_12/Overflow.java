package lesson_12;

public class Overflow {
    public static void main(String[] args) {

        // -128....127
        byte byteVar = 127;
        System.out.println(byteVar);
        // При добавлении к максимальному числу диапозона 1 - мы получим минимальное число диапозона
        byteVar++;
        System.out.println(byteVar);
        // При вычитании 1 из минимального числа - мы получим максимальное число диапозона
        byteVar --;
        System.out.println(byteVar);

        short shortVar = 32767;
        System.out.println(shortVar);

        shortVar += 5;
        System.out.println(shortVar);
    }
}
