package homeworks.homework_24;

/*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака,
не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).

Если да -> идем тренироваться -> берет барьер
 */
public class JumpingDog {

    private String dogName;
    private int jumpHeight;
    private int barrierHeight;

    public JumpingDog(String name, int jumpHeight) {
        this.dogName = name;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return dogName;
    }

    public void setName(String name) {
        this.dogName = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println("Я прыгаю!");
    }

    public void training() {
        System.out.println("Идём тренироваться! ");
        jumpHeight += 10;
    }

    public void jumpBarrier(int barrierHeight) {


        if ((jumpHeight * 2) < barrierHeight) {
            System.out.println("Неа!!! не сможет");
        } else {
            while (jumpHeight < barrierHeight) {
                training();
            }
            System.out.print("берём барьер   ");
            jump();
        }
    }


}
