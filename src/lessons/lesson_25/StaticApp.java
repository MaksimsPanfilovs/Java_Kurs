package lessons.lesson_25;

import java.util.Arrays;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println("Static counter: " + StaticBlockDemo.conter);
        System.out.println("Static array: " + Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo();
//
//        System.out.println("demo.toString(): " + demo.toString());
//        System.out.println("Static array: " + Arrays.toString(StaticBlockDemo.colors));
//
        StaticBlockDemo demo1 = new StaticBlockDemo();
        StaticBlockDemo demo2 = new StaticBlockDemo("Title");




    }
}
