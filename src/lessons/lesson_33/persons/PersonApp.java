package lessons.lesson_33.persons;

import lessons.lesson_34.persons.Person34;

public class PersonApp {
    public static void main(String[] args) {

        Person34 person = new Person34("test@mail.com", "pasffefe");

        System.out.println(person);
        person.setEmail("we@stmail.net");
        System.out.println(person);
        person.setPassword("Pass1!word");
        System.out.println(person);


    }
}
