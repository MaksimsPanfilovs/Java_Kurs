package lessons.lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {



    }

    // Обертка указывает на необходимость проверки на null.
    public static Optional<User> getById(int id) {
        // Список пользователей
        // Перебираем пользователей, сравниваем id.
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public static Optional<User> getById2(int id) {
        // Список пользователей
        // Перебираем пользователей, сравниваем id.
        User result = null;

        for (User user : users) {
            if (user.getId() == id) {
                result = user;
            }
        }
        return Optional.ofNullable(result);
    }



}
