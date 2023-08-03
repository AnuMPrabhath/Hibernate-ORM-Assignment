import dao.BookDAO;
import entity.Book;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();

        // Save
        Book book = new Book("B001", "Hath Pana", "Kumaratunga Munidasa", 1990, 500.00);
        bookDAO.saveBook(book);

        // Retrieve
        Book book_detail = bookDAO.getBook(book);
        System.out.println("Code : "+book_detail.getCode());

        // Update (year & price)
        book.setYear(1918);
        book.setPrice(300);
        bookDAO.updateBook(book);

        // Delete
        bookDAO.deleteBook(book);
    }
}
