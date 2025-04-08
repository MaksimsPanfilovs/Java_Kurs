package lessons.lesson_49.validator;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
        }
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку!");
            this.email = email;
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели некорректный email: " + e.getMessage());
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
        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявление переменной
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "!%$@&*()[],.-";

        // Перебираем символы
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
//            if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;
        }
        System.out.printf("%s | %s | %s | %s\n", isDigit, isLowerCase, isUpperCase, isSpecialSymbol);

        // Если хотя бы одна из переменных останется в значении false, то весь пароль НЕ будет признан валидным (вернется false).
        return isDigit && isLowerCase && isUpperCase && isSpecialSymbol;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
