package lesson_24;
/*
Массив объектов (массив ссылочных типов данных). Массив, элементы которого являются ссылками на объекты
 */
public class PersonApp {
    public static void main(String[] args) {

        lesson_24.Person garry = new lesson_24.Person("Garry",31,"Photo");
        System.out.println(garry.toString());

        lesson_24.Person john = new lesson_24.Person("John",75,"Reading, Music");
        System.out.println(john.toString());

        lesson_24.Person[] people = new lesson_24.Person[5]; // Создаю массив для 5
        // Значение по умолчанию для типов данных - null.

        people[0] = garry;
        people[3] = john;
        people[1] = new lesson_24.Person("Tom",5,"crying");

        System.out.println("\n===================\n");

        System.out.println("people[0]: " + people[0].toString());
        System.out.println(people[0].getName());

        people[0].setName("Peter");
        System.out.println(people[0].toString());
        System.out.println(garry.toString());

        System.out.println("\n===============\n");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println(people[i].getName());
            }else {
                System.out.println("NULL!!!!");
            }
        }

        System.out.println("\n==================================\n");
        lesson_24.Person test = new lesson_24.Person("Test",50,"coding");

        people[2] = test;

        people[2].setName("test1");
        test.setAge(52);

        System.out.println(test.toString());

        test = null; // Ссылка не будет ссылаться ни на какой объект(но осталась связь с people[].
        System.out.println(people[2].getHobby());

        test = people[1];

        lesson_24.Person deleteMe = new lesson_24.Person("DeleteMe",43,"gut");
        deleteMe = null; // никто не ссылается на объект, позже будет удалён.



    }
}
