package lesson_15;

public class TernaryOperator {
    public static void main(String[] args) {


        // Тернарный оператор - краткая форма записи оператора if - else, которая позволяет присваивать значение
        // переменной в зависимости от условия

        // Введите ваш возраст

        int age = 20;

        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        }else {
            status = "Не совершеннолетний";
        }

        System.out.println(status);

        // переменная = (условие) ? значение_если_true : значение_если_false

        String result = (age >= 18) ? "Совершеннолетний" : "Не совершеннолетний";
        System.out.println(result);

        int x = 10;

        System.out.println("Значение в переменной x " + ((x >= 0) ? "положительное" : "отрицательное"));
    }
}
