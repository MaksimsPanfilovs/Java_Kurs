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

        dog3.jumpBarrier(70);
        dog1.jumpBarrier(70);




    }
}
