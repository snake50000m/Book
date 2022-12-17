import models.Book;
import models.Reader;

public class Main {
    public static void main(String[] args) {
        Book hp = new Book("J.Rouling", "Harry Potter");
        Book eo = new Book("A.Pushkin", "Evgenii Onegin");
        Book holm = new Book("Artur Conan Doyle", "Sherlock Holms");

        Reader student = new Reader("Данилл Протопопов", 343513452345L, "ЕТФ", "02.12.2002", "996500266744");
        Reader student2 = new Reader("Хасан Нурубулоев", 343513452345L, "ЕТФ", "02.12.2002", "996500266744");
        student.takeBook(3);
        student.takeBook(new Book[]{hp, eo, holm});

        student2.takeBook(4);
    }
}