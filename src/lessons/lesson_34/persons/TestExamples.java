package lessons.lesson_34.persons;


import homeworks.homework_24.Claculator;
import lessons.lesson_27.Autobus;
import lessons.lesson_27.BusDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // @BeforeEach - Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }

    /*
    @BeforeAll - метод выполняется один раз перед выполнением первого тестового
    @AfterEach - выполняется после КАЖДОГО тестового метода
    @AfterAll - метод выполняется один раз после выполнения всех тестовых методов
    @disabled - указываем, что тест отключен и выполняться не будет
     */

    // @Test Указывает, что метод является тестовым.
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов.

    @Test
    public void testAddition() {
        //Протестировать, правильно ли работает метод класса Calculator
        int result = Claculator.addition(2, 3);

        // Реальное / фактическое значение переменной result
        // Ожидаемое значение - 5.

        // assertEquals(expected, result);
        Assertions.assertEquals(5, result); // проверяет равны ли два значения. Тест будет пройден, если 2 значения равны.
        Assertions.assertNotEquals(0, result); // Тест будет пройден, если фактический результат НЕ совпадет с "неожидаемым" результатом.
        Assertions.assertTrue(result >= 4); // Проверяет, что условие верно (условие возвращает true).
        assertEquals(10, 5 + 5); // статический импорт позволяет использовать методы, без обращения к классу.
        assertFalse(result > 10); // проверяет, что условие ложно (условие выдает true).
        assertNull(null); // Проверяет, что объект null. Тест будет пройден, если объект равен null.
        assertNotNull("String"); // порверяет, что объект не равен null.


    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Если в методе нет ложного утверждения - он считается пройденным.
        // В том числе пустой (вообще без утверждений) считается пройденным.
    }

    // Параметризованные методы

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("curent value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() >= 4);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testStatic(int value) {
        System.out.println("static value run: " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "3214214"), 10);
        System.out.println(bus);
    }

    // Источник данных в формате CSV -
    // Источник данных файл в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit) {
        System.out.println("Current Value: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current Value: " + value);
        assertNotEquals(100, value);
    }
    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEqual) {
        System.out.println(value + " | " + isEqual + " | " + expected);
        int result = value * value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person34 person, String newEmail) {
        System.out.println("Curren Value: " + person);
        System.out.println("New Email: " + newEmail);
    }

    static Stream<Arguments> testPersonData() {
        Person34 person = new Person34("test@email.net", "dfei2A@feef");
        return Stream.of(
                Arguments.of(person, "new1234#mail.com"),
                Arguments.of(person, "new1234#mail.com")

                );
    }





}