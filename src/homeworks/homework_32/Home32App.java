package homeworks.homework_32;

public class Home32App {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Привет!", "Мир!!!");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println("\n==================");

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println("\n==================");

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());


    }
}
