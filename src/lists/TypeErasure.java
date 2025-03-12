package lists;

public class TypeErasure <E> {

    private E value;

    public TypeErasure(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    // Нельзя сделать перегруженный метод, отличающийся только типами параметров.
    public void method (TypeErasure<Integer> typeErasure){
        System.out.println(typeErasure);
    }

//    public void method (TypeErasure<String> typeErasure){
//        System.out.println(typeErasure);
//    }

    public static void main(String[] args) {

        TypeErasure<Integer> t = new TypeErasure<>(5);
    }



}
