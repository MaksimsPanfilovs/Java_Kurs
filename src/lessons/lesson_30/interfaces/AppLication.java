package lessons.lesson_30.interfaces;

public class AppLication {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "И.Булгаков");

        book.print();

        Journal journal = new Journal("Cosmopolitan", 154);

        journal.print();
        journal.defaultMethod();

        System.out.println("\n======================");

        // Тип ссылки типа интерфейс.
        // Набор методов, доступных по ссылке - методы которые прописаны в интерфейсе.
        // Объект класса, который реализовал данный интерфейс.
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки.

        Printable printable2 = new Book("Философия Java", "Б. Эккель");
        printable2.print();


        Printable.testStaticMethod("Hello!");

        System.out.println("\n======================");

        ColorPrintable presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance"
        );

        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();


        book.defaultMethod();



    }
}
