package homeworks.homework_28.runners;

public class AmatereRunner extends Human {


    // Блок инициализации
    {
        typeRunner = "Спортсмен-любитель";
    }

    public AmatereRunner() {
        super(15, 10);
    }

    public AmatereRunner(int runspeed, int restTime) {
        super(runspeed, restTime);
    }

}
