package lesson_18;

public class MethodWithReturn {
    public static void main(String[] args) {

        // Возвращаемое значение - это результат, который метод отправляет обратно вызывающему его (метод) коду как результат своей программы.
        // Это способ передать результат вычеслений метода в другие части программы

//        int sum = 10 + 5;
        calculateSum(10, 5);
        int sum = calculateSum(10, 5); // -> int sum = 15;

        sum = calculateSum(10, 5) + calculateSum(20, 30); // sum = 15 + 50 -> sum = 65;

        System.out.println("\n=========================\n");

        double pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);

        System.out.println("powTwo(0): " + powTwo(0));

        System.out.println("powTwo(-1): " + powTwo(-2));


        test(1);
        test(4);
        test(5);


    }// end method

    public static void test(int x) {
        // НЕ печатать числа, если x = 3;
        if (x == 3) {
            // Как-то прервать работу метода?!
            return; // прекращает работу метода, в void методах должен использоваться без возвращаемого значения
        }

        // печатает числа от 0 до x
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Написть метод возвращающий 2 в степени x. x метод получает в качестве параметра
    public static double powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        boolean isPositive = x >= 0;

        // что если x отрицательный - отбросить знак числа
        if (x < 0) x *= -1;

        // вычесляем 2 ^ |x|
        double result = 1;
        // x = 2;
        for (int i = 1; i <= x; i++) {
            result = result * 2;
        }
        if (isPositive) {
            return result;

        }else {
            // 1 / double -> 1 / 4.0 -> 0.25
            return 1 / result;

        }
    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // return - оператор, заканчивающий работу метода и возвращающий значение
    }

}// end class
