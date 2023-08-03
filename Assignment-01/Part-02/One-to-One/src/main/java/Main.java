import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("1234567v", "Kumaratunga Munidasa", "1887");
        Book book = new Book("B001", "Hath Pana", 1918, 300.00, author);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author);
        session.persist(book);
        transaction.commit();
        session.close();
    }
}
