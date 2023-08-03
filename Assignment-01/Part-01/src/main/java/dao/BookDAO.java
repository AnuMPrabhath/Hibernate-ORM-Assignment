package dao;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

public class BookDAO {
    public void saveBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        transaction.commit();
        session.close();
    }
    public Book getBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Book book1 = session.get(Book.class, book.getCode());
        transaction.commit();
        session.close();
        return book1;
    }
    public void updateBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
    }
    public void deleteBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }
}
