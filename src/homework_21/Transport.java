package homework_21;
/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания
 */
public class Transport {

    String name;
    int peopleNum;
    double cargoQuan;


    public Transport(String name, int peopleNum, double cargoQuan){

        this.name = name;
        this.peopleNum = peopleNum;
        this.cargoQuan = cargoQuan;
    }

    public void transInfo() {
        System.out.printf("In %s, can go max %d people and can be transported max %.2f t.\n", name, peopleNum, cargoQuan);
    }

}
