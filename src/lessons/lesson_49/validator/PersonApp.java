package lessons.lesson_49.validator;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("=====================\n");
        Person person1 = new Person("john.gmail.com", "qwerty");
        System.out.println(person1);

    }
}
