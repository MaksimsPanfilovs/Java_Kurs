package homeworks.homework_30.bank;

public abstract class Account implements PaymentSystem {

    private String title;
    private double balance;

    protected String currency;
    protected String typeAccount;


    public Account(String title) {
        this.title = title;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.printf("Недостаточно денег на счету для снятия %.2f %s\n", amount, currency);
            return;
        }
        balance -= amount;
        System.out.printf("%s %s. Снято со счета %.2f %s\n", typeAccount, title, amount, currency);
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount <= 0) return;
        balance += amount;
        System.out.printf("%s %s. Зачислено на счет %.2f %s\n", typeAccount, title, amount, currency);
    }

    @Override
    public double checkBalance() {
        return balance;
    }


    // Вывод денег - сумма которую переводим - всегда в валюте нашего
    // Проверяем валюту счета получателя. Высчитываем курс пересчета
    // отправляем получателю сумму к валюте счета получателя.
    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > checkBalance()) {
            System.out.printf("Недостаточно средств! Transfer %.2f | Balance %.2f\n", amountEur, balance);
            return;
        }
        if (recipient.getCurrency().equals("EUR")) {
            // перевод на евровый счет (конвертация не нужна).
            withdrawMoney(amountEur);
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод (%s -> %s) %.2f %s завершен.\n",
                    getTitle(), recipient.getTitle(), amountEur, currency);
            return; // true
        }

        if (recipient.getCurrency().equals("BTC")) {
            // Конвертировать EUR в BTC
            double amountBtc = amountEur / recipient.getCourseToEur();

            withdrawMoney(amountEur);
            recipient.depositTransfer(amountBtc);

            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR -> %.5f %s завершен \n",
                    getTitle(), recipient.getTitle(), amountEur, amountBtc, recipient.getCurrency());
            return; // true
        }

    }

    @Override
    public double getCourseToEur() {
        return 1;
    }

    public String getTitle() {
        return title;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Balance: %.2f %s",
                typeAccount, getTitle(), checkBalance(), currency);
    }
}
