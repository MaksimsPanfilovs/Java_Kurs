package homeworks.homework_28.runners;

public class ProfiRunner extends Human {

    {
        typeRunner = "Спортсмен-профи";
    }

    public ProfiRunner() {
        super(25, 5);
    }

    public ProfiRunner(int runspeed, int restTime) {
        super(runspeed, restTime);
    }
}
