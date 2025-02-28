package homework_14;
/*
Task 5
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.

Output:
Максимальное число: 33
 */
public class Home14Task05 {
    public Home14Task05() {
        super();
    }

    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 65;
        int num3 = 37;
        int num4 = 25;

        System.out.printf("Числа: %d %d %d %d\n", num1, num2, num3, num4);


        if (num1 > num2 & num1 > num3 & num1 > num4) {
            System.out.println("Максимальное число: " + num1);
        }
        else if (num2 > num1 & num2 > num3 & num2 > num4 ) {
            System.out.println("Максимальное число: " + num2);
        }
        else if (num3 > num1 & num3 > num2 & num3 > num4) {
            System.out.println("Максимальное число: " + num3);
        }
        else if (num4 > num1 & num4 > num2 & num4 > num3) {
            System.out.println("Максимальное число: " + num4);
        }
        else if (num1 == num2 | num1 == num3 | num1 == num4 ) {
            System.out.println("Максимальное число: " + num1);
        }
        else if ( num2 == num3 | num2 == num4) {
            System.out.println("Максимальное число: " + num2);
        }
        else if (num3 == num4){
            System.out.println("Максимальное число: " + num3);
        }





    }
}
