package consultations.cons_11.animals;

public class Cat extends Animal {

    private int age;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
