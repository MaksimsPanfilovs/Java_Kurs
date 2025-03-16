package lessons.lesson_33.persons;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */
    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) return false;

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
            if (!isPass) return false; // делай что-то если переменная false
        }

        // 5. До собаки должен быть хотя бы один символ
        if (indexAt == 0) return false;

        // 6. Первый символ - должна быть буква
        if (!Character.isLetter(email.charAt(0))) return false;

        // Все проверки пройдены. Email подходит
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPassValid(password)) {
            this.password = password;
        }
    }

    /*
    Требования к паролю:
    1. Длина пароля >= 8
    2. Должна быть мин 1 цифра
    3. Должна быть мин 1 маленькая буква -> Character.isLowerCase()
    4. Должна быть мин 1 большая буква
    5. Должна быть мин 1 специальный символ: "!%$@&*()[],.-"

    Пароль должен удовлетворять ВСЕМ требованием сразу.
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль будет подходить только если все пять - имеют true
     */

    public boolean isPassValid(String password) {
        for (char ch : password.toCharArray()) {
            boolean isPast = Character.isDigit(ch)
                    && Character.isLowerCase(ch)
                    && Character.isUpperCase(ch)
                    && (ch == '!' || ch == '%'
                    || ch == '$' || ch == '@'
                    || ch == '&' || ch == '*'
                    || ch == '(' || ch == ')'
                    || ch == '[' || ch == ']'
                    || ch == ',' || ch == '.'
                    || ch == '-');
            // Длина пароля >= 8
            if (isPast && password.length() >= 8) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
