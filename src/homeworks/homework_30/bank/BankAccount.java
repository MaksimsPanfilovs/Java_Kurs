package homeworks.homework_30.bank;

public class BankAccount extends Account {

    public BankAccount(String title) {
        super(title);
        currency = "EUR";
        typeAccount = "Bank";
    }
}
