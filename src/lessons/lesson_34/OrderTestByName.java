package lessons.lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Тесты будут выполняться по алфавитному порядку названий тестовых методов.
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderTestByName {

    @Test
    void testB() {
        System.out.println("TestB");
    }

    @Test
    void testA() {
        System.out.println("TestA");
    }

    @Test
    void testZ() {
        System.out.println("TestZ");
    }

    @Test
    void testC() {
        System.out.println("TestC");
    }

}
