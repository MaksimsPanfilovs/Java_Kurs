package lessons.lesson_29.children;

public class Parent {

    private String name;

    // Автоматически добавляется при компиляции (т.к. нет ни одного конструктора)
    public Parent() {
        // Все поля инициализируются значениями по умолчанию
    }


    public Parent(String name) {
        this.name = name;
    }

    // Невозможно изменить реализацию (переопределить) в наследниках
    final void show() {
        System.out.println("Show must go on");
    }
}
