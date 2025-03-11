package homeworks.homework_30.triathlete;

/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class Triathlete implements Swimmer, Runner {
    private String name;
    private int age;
    private String typ = "отлично";

    public Triathlete(String name, int age) {
        if (name == null) name = "Noname";
        if (age > 40) typ = "ещё";
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        if (age < 0 || age > 100) {
            System.out.println("Не до бега");
            return;
        }
        System.out.printf("Спортсмен %s (%d), %s бегает!\n",
                name, age, typ);
    }

    @Override
    public void swimm() {
        if (age < 0 || age > 100) {
            System.out.println("Не до плавания");
            return;
        }
        System.out.printf("Спортсмен %s (%d), %s плавает!\n",
                name, age, typ);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Triathlete{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
