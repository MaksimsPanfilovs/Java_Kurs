package homeworks.homework_24;

public class Home24Main {

    public static void main(String[] args) {

        System.out.println(Claculator.addition(10, 5));

        System.out.println(Claculator.subtraction(10, 5));

        System.out.println(Claculator.generation(10, 5));

        System.out.println(Claculator.dividing(10, 5));

        System.out.println("\n===========================");




        JumpingDog dog = new JumpingDog("Fass", 20);
        JumpingDog dog1 = new JumpingDog("Klik", 35);
        JumpingDog dog2 = new JumpingDog("Dogy", 50);
        JumpingDog dog3 = new JumpingDog("Ludvig", 80);

        dog3.jumpBarrier(170);
        dog3.jumpBarrier(370);
        dog3.jumpBarrier(470);
        dog1.jumpBarrier(170);


        System.out.println("\n============ Teacher Variant =================");


        double d1 = 10.0;
        double result = d1 / 0;

        System.out.println("10.0 // 00: " + result);

        // Infinity - бесконечность
        // NaN - значение не определено (не является числом)

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println("inf1: " + inf1);
        System.out.println("inf2: " + inf2);

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        System.out.println("10.0 / 10.0: " + 10.0 / 10.0);
        System.out.println("inf1 / inf2: " + inf1 / inf2);

        System.out.println("inf1 * -1: " + inf1 * -1);

        // Сравнеие на равенство значения с бесконечностью.
        System.out.println(inf1 == Double.POSITIVE_INFINITY);







    }
}
