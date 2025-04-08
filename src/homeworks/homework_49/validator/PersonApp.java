package homeworks.homework_49.validator;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("=====================\n");
        Person person1 = new Person("john.gmail.com", "qwerty88888");
        System.out.println(person1);

        System.out.println("=============\n");
        // TODO -> Если пароль не проходит по нескольким параметрам - выдать сообщение об ошибке
        // с указанием ВСЕХ пунктов
        Person person2 = new Person("john@gmail.com", "qwerty222222Q%");
        System.out.println(person2);

    }
}
