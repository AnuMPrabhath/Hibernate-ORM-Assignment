import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Author author = new Author("1234567v", "Kumaratunga Munidasa", "1887", bookList);

        Book book1 = new Book("B001", "Hath Pana", 1918, 300.00, author);
        Book book2 = new Book("B002", "Magul Kema", 1922, 500.00, author);
        Book book3 = new Book("B003", "Book Title", 1925, 25000.00, author);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author);
        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        transaction.commit();
        session.close();
    }
}
