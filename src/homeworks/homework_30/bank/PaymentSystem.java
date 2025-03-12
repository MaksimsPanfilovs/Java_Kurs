package homeworks.homework_30.bank;
/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
public interface PaymentSystem {

    void withdrawMoney(double amount);

    void depositTransfer(double amount);

    double checkBalance();

    void transferMoney(double amount, PaymentSystem recipient);

    double getCourseToEur();

    String getCurrency();
    String getTitle();

}
