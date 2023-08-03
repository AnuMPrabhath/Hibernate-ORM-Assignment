import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Author> authorList = new ArrayList<>();

        Author author1 = new Author("1234567v", "Name-01", "1990", bookList);
        Author author2 = new Author("12334557v", "Name-02", "1970", bookList);

        Book book1 = new Book("B001", "Title-01", 1820, 500, authorList);
        Book book2 = new Book("B002", "Title-02", 1820, 400, authorList);
        Book book3 = new Book("B003", "Title-03", 1820, 700, authorList);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        authorList.add(author1);
        authorList.add(author2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author1);
        session.persist(author2);

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        transaction.commit();
        session.close();
    }
}
