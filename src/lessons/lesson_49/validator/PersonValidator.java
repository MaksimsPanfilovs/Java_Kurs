package lessons.lesson_49.validator;

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {
        /*
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */
        // throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения).

        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        // 4. Алфавит, цифры, '-', '_', '@', '.'
        /*
        Перебираю все символы в строке. Проверяю текущий символ.
        Если нахожу хоть один "не правильный" сразу возвращаем false
         */
        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {
            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            // Если символ не подходит (isPass = false) возвращаем false
            if (!isPass) throw new EmailValidateException("Illegal symbol");
            // делай что-то если переменная false
        }

        // 5. До собаки должен быть хотя бы один символ
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

        // 6. Первый символ - должна быть буква
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

        // Все проверки пройдены. Email подходит
    }


}
