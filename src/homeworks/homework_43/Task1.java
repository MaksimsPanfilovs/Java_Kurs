package homeworks.homework_43;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers2 = new ArrayList<>(List.of(3, 4, 4, 5, 5, 6, 7, 8));

        System.out.println("нач. список: " + integers);

    }

    private static <T> List<T> intersection(List<T> integers, List<T> integers2) {
        List<T> result = new ArrayList<>(integers);
        return null;

    }




}
