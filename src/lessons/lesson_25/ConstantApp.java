package lessons.lesson_25;

public class ConstantApp {
    public static void main(String[] args) {

        // Невозможно изменить значение константы
        // ConstsntDemo.PI = 555;
        System.out.println(ConstantDemo.PI);
        System.out.println(ConstantDemo.doublePiSqrt());

        String result = "Java" + "fun!";

        StringBuilder sb = new StringBuilder();
        // Todo показать на след лекции
    }
}
