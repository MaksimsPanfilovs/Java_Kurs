package homeworks.homework_34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class Person34Test {

    Person34 person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%s";

    @BeforeEach
    void setUp() {
        person = new Person34(startEmail, startPassword);
    }

    /*
    1. Беру валидный email
    2. Устанавливаем его сеттером person-у
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2.
     */


    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());

    }

    /*
    1. Берем НЕ валидный email
    2. Устанавливаем его сеттером.
    3. Ожидаемый результат: Email установлен не будет
        3.1. поле email у person НЕ будет равно "не валидный email"
        3.2. Значение поля email должно остаться прежним
     */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {

        person.setEmail(invalidEmail);

        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());


    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net ",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"
        );
    }

}
