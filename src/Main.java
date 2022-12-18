import models.Book;
import models.Reader;

public class Main {
    public static void main(String[] args) {
        Book hp = new Book("J.Rouling", "Harry Potter");
        Book eo = new Book("A.Pushkin", "Evgenii Onegin");
        Book holm = new Book("Artur Conan Doyle", "Sherlock Holms");
        String[] bookNames = new String[]{"Harry Potter", "Evgenii Onegin", "Sherlock Holms"};

        Reader student = new Reader("Данилл Протопопов", 343513452345L, "ЕТФ", "02.12.2002", "996500266744");
        Reader student2 = new Reader("Хасан Нурубулоев", 343513452346L, "ЕТФ", "03.12.2002", "996707931678");
        student.takeBook(3);
        student.takeBook(bookNames);
        student.takeBook(new Book[]{hp, eo, holm});

        System.out.println();

        student.returnBook(2);
        student.returnBook(new String[]{"Harry Potter", "Evgenii Onegin"});
        student.returnBook(new Book[]{hp, eo});

    }
}