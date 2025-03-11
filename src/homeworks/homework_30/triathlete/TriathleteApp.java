package homeworks.homework_30.triathlete;

public class TriathleteApp {

    public static void main(String[] args) {

    Triathlete man1 = new Triathlete("John", 30);
    Triathlete man2 = new Triathlete("Alex", -45);
    Triathlete man3 = new Triathlete(null, 23);


    man1.swimm();
    man2.swimm();

    man1.run();
    man2.run();

    man3.run();
    man3.swimm();





    }




}
