package homeworks.homework_28.runners;

public class RunnersApp {

    public static void main(String[] args) {

        Human human = new Human();

        AmatereRunner amateur = new AmatereRunner(15, 10);

        human.run();

        amateur.run();

        ProfiRunner profi = new ProfiRunner(25, 5);

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateur;
        humans[2] = profi;

        System.out.println("\n ===============");

        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
        }
    }
}
