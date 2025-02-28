package homework_16;
/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */
public class Home16Task02 {
    public static void main(String[] args) {

        String str = "Task";
        int num = 1;

        while (num <= 10){
            System.out.println(str + num++);
        }
    }
}
