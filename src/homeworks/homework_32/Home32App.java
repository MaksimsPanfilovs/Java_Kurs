package homeworks.homework_32;

import lists.MyArrayList;

public class Home32App {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Привет!", "Мир!!!");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println("\n==================");

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
        System.out.println("\n==================");

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());

        NumericPair1<Integer> pair1 = new NumericPair1<>(21, 32);
        System.out.println(pair1.sum());

        System.out.println("\n============== PrintList ==========\n");

        MyArrayList<String> names = new MyArrayList<>();
        names.addAll("Alice", "Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.addAll(85, 92);

        PrintLists.printTwoLists(names, scores);



    }
}
