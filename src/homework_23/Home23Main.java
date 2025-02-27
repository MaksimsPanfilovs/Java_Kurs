package homework_23;

import java.util.Arrays;

public class Home23Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        System.out.println(employee.info());


        int[] test1 = {1, 2, 3, 4, 5};

        MagicArray23 magic = new MagicArray23(test1);

        magic.test();
        magic.add(8);



        System.out.println(Arrays.toString(magic.toArray()));
        System.out.println(magic.size());

    }
}
