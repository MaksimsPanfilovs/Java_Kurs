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

        EmployeeInLec employee1 = new EmployeeInLec("Max",45,5000.00);
        employee1.info();
        System.out.println(employee1.getName());

        EmployeeInLec peter = new EmployeeInLec("Peter",35,3500.00);
        peter.info();
        System.out.println(peter.getSalary());

    }
}
