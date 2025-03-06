package homeworks.homework_27.computer;
/*
Task 2
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
 */
public class Component {
    protected String brand;
    protected String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("Марка: " + brand).append(", модель: " +model);
        sb.append("]");
        return sb.toString();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
