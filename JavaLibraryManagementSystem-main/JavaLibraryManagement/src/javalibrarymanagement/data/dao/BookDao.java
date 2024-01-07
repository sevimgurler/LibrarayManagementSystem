package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Book;


public interface BookDao {
    
    public ArrayList<Book> getAllBooks();
    
    public ArrayList<Book> searchWithName(String searchKey);
    
    public ArrayList<Book> searchWithISBN(String searchKey);
    
    public ArrayList<Book> searchWithAuthor(String searchKey);
    
    public ArrayList<Book> searchWithCategory(String searchKey);
    
    public ArrayList<Book> searchWithPublisher(String searchKey);
    
    public Boolean addBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author );
    
    public Boolean deleteBook(String ISBN);
    
    public Boolean updateBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author );

}
