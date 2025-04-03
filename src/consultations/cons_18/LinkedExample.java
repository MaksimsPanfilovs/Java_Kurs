package consultations.cons_18;

import lists.MyLinkedList;

public class LinkedExample {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        System.out.println(list);

        System.out.println(list.size());

        int value = list.get(4);
        System.out.println(value);






    }

}
