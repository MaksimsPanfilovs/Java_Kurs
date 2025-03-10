package homeworks.homework_28.runners;

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Human {

    private int runspeed;
    private int restTime;
    protected    String typeRunner = "Человек";

    public Human() {
        this(10, 15);
//        this.runspeed = 10;
//        this.restTime = 15;
    }

    public Human(int runspeed, int restTime) {
        this.runspeed = runspeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч.", typeRunner, runspeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут отдыха.", typeRunner, restTime);
    }

    public int getRunspeed() {
        return runspeed;
    }

    public void setRunspeed(int runspeed) {
        this.runspeed = runspeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
