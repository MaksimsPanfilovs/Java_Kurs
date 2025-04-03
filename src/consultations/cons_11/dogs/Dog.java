package consultations.cons_11.dogs;

/*
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier.
В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки
(будет ли данная собака в принципе в состоянии взять барьер).


Если да -> идем тренироваться -> берет барьер
 */
public class Dog {

    private String name;
    private int jumpHeight;

    private final int maxJumpHeight;

    private static final int INCREASE_PER_TRAINING = 10;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJumpHeight = jumpHeight * 2;
    }

    public void jump() {
        System.out.println(name + " прыгнула");
    }

    public void train() {
        jumpHeight += INCREASE_PER_TRAINING;

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }
    }

    public boolean jumpBarrier(int barrier) {
        // Текущий прыжок больше или равен барьеру?
        if (jumpHeight >= barrier) {
            // Может прыгнуть без всяких тренировок
            jump();
            return true;
        }

        //  нужно проверить помогут ли тренировки
        if (maxJumpHeight >= barrier) {
            // надо тренироваться и потом прыгать
            while (jumpHeight < barrier) {
                train();
            }

            // 74 vs 147 - 144 vs 147 -> 154 vs 148

            jump();
            System.out.printf("Собака %s (%d) перепрыгивает барьер %d\n", name, jumpHeight, barrier);
            return true;
        }

        // сюда попадем когда барьер, больше чем максимум
        System.out.printf("Барьер высотой %d собака %s (%d) взять может!\n", barrier, name, jumpHeight);
        return false;

    }

    public String toString() {
        return String.format("Dog %s; current jump: %d. Max jump: %d", name, jumpHeight, maxJumpHeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }


    // 74 : 147 -> 145..148
}
