package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.BookDao;
import javalibrarymanagement.data.model.Book;
import javalibrarymanagement.patterns.searchStrategy.AuthorSearch;
import javalibrarymanagement.patterns.searchStrategy.CategorySearch;
import javalibrarymanagement.patterns.searchStrategy.ISBNSearch;
import javalibrarymanagement.patterns.searchStrategy.NameSearch;
import javalibrarymanagement.patterns.searchStrategy.PublisherSearch;


public class BookDaoImpl implements BookDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private final AuthorSearch authorSearch = new AuthorSearch();
    private final CategorySearch categorySearch = new CategorySearch();
    private final ISBNSearch isbnSearch = new ISBNSearch();
    private final NameSearch nameSearch = new NameSearch();
    private final PublisherSearch publisherSearch = new PublisherSearch();
    private static BookDao instance;
    
    public static synchronized BookDao getInstance(){
        if (instance == null) {
            instance = new BookDaoImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT book.bookISBN, book.totalCopies, book.bookName, CONCAT(author.authorName,' ',author.authorLastName) AS author, YEAR(book.publicationYear) as publicationYear, category.categoryName, publisher.publisherName, publisher.publicationLanguage, CONCAT('Shelf:',location.shelfName, ' No:',location.shelfNo,' Floor:',location.floorNo) AS location, book.bookEdition, CASE WHEN book.avaibleCopies > 0 THEN 'Available' ELSE 'Not Available' END AS status FROM library_management_system.book AS book JOIN library_management_system.category AS category ON book.categoryID = category.categoryID JOIN library_management_system.book_author AS ba ON book.bookISBN = ba.bookISBN JOIN library_management_system.author AS author ON ba.authorID = author.authorID JOIN library_management_system.location AS location ON book.locationID = location.locationID JOIN library_management_system.publisher AS publisher ON book.publisherID = publisher.publisherID GROUP BY book.bookISBN, book.totalCopies, book.bookName,  YEAR(book.publicationYear), book.bookEdition, book.totalCopies, book.avaibleCopies, location.shelfName, location.shelfNo, location.floorNo, category.categoryName, publisher.publisherName, publisher.publicationLanguage, author.authorName, author.authorLastName;");
            while(results.next()){
                bookList.add(new Book(
                        results.getString("bookISBN"),
                        results.getString("bookName"),
                        results.getString("author"),
                        results.getString("publicationYear"),
                        results.getString("categoryName"),
                        results.getString("publisherName"),
                        results.getString("publicationLanguage"),
                        results.getInt("bookEdition"),
                        results.getString("status"),
                        results.getString("location"),
                        results.getInt("totalCopies")
                    )
                );
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return bookList;
    }

    @Override
    public ArrayList<Book> searchWithName(String searchKey) {
        return nameSearch.search(searchKey);
    }

    @Override
    public ArrayList<Book> searchWithISBN(String searchKey) {
        return isbnSearch.search(searchKey);
    }

    @Override
    public ArrayList<Book> searchWithAuthor(String searchKey) {
        return authorSearch.search(searchKey);
    }

    @Override
    public ArrayList<Book> searchWithCategory(String searchKey) {
        return categorySearch.search(searchKey);
    }

    @Override
    public ArrayList<Book> searchWithPublisher(String searchKey) {
        return publisherSearch.search(searchKey);
    }

    @Override
    public Boolean addBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author){
        Boolean result = true;
        try{
            if(!statement.execute("INSERT INTO `library_management_system`.`book` (`bookISBN`, `bookName`, `publicationYear`, `bookEdition`, `totalCopies`, `avaibleCopies`, `locationID`, `categoryID`, `publisherID`) VALUES ('"+ISBN+"', '"+name+"','    "+year+"', '"+edition+"', '"+copies+"', '"+copies+"', '"+location+"', '"+category+"', '"+publisher+"');")){
                result = statement.execute("INSERT INTO `library_management_system`.`book_author` (`bookISBN`, `authorID`) VALUES ('"+ISBN+"', '"+author+"');");
            }else{
                return true;
            }
        }catch(SQLException e){
            System.err.println(e);
            return true;
        }
        return result;
    }

    @Override
    public Boolean deleteBook(String ISBN)  {
        Boolean result=false;
        try{
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM `library_management_system`.`book_issue` WHERE (`bookISBN` = '"+ISBN+"' AND `issueStatus` = 0);");
            rs.next();
            if(rs.getInt(1)==0){
                result = statement.execute("DELETE FROM `library_management_system`.`book_issue` WHERE (`bookISBN` = '"+ISBN+"') AND (`issueStatus` = 0);");
                if(!result){
                    if(!statement.execute("DELETE FROM `library_management_system`.`book_author` WHERE (`bookISBN` = '"+ISBN+"');")){
                        System.err.println("Yazardan slindi");
                        if(!statement.execute("DELETE FROM `library_management_system`.`book_request` WHERE (`bookID` = '"+ISBN+"');")){
                            System.err.println("Request slindi");
                            return !statement.execute("DELETE FROM `library_management_system`.`book` WHERE (`bookISBN` = '"+ISBN+"');");
                        }
                    }
                }   
            }else{
                return false;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean updateBook(String ISBN, String name, String year, String edition, int copies, int location, int category, int publisher, int author) {
        Boolean result = false;
        try{
            if(!statement.execute("UPDATE `library_management_system`.`book` SET `bookName` = '"+name+"', `bookEdition` = '"+edition+"', `totalCopies` = '"+copies+"', `avaibleCopies` = '"+copies+"', `locationID` = '"+location+"', `categoryID` = '"+category+"', `publisherID` = '"+publisher+"' WHERE (`bookISBN` = '"+ISBN+"');")){
                result = statement.execute("UPDATE `library_management_system`.`book_author` SET `authorID` = '"+author+"' WHERE (`bookISBN` = '"+ISBN+"');");
            }else{
                return false;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
