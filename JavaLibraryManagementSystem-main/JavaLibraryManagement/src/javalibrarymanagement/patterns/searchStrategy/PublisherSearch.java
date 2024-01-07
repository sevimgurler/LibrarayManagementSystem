/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.patterns.searchStrategy;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.model.Book;

/**
 *
 * @author erenm
 */
public class PublisherSearch implements SearchStrategy{
    
    private Statement statement = SingletonDataWorks.getStatement();;
    private ResultSet results;

    @Override
    public ArrayList<Book> search(String searchKeyword) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        try{
            results = statement.executeQuery("SELECT book.bookISBN, book.totalCopies, book.bookName, CONCAT(author.authorName, ' ', author.authorLastName) AS author, YEAR(book.publicationYear) AS 'publicationYear', category.categoryName, publisher.publisherName, publisher.publicationLanguage, CONCAT('Shelf:', location.shelfName, ' No:', location.shelfNo, ' Floor:', location.floorNo) AS location, book.bookEdition, CASE WHEN book.avaibleCopies > 0 THEN 'Available' ELSE 'Not Available' END AS status FROM library_management_system.book AS book JOIN library_management_system.category AS category ON book.categoryID = category.categoryID JOIN library_management_system.book_author AS ba ON book.bookISBN = ba.bookISBN JOIN library_management_system.author AS author ON ba.authorID = author.authorID JOIN library_management_system.location AS location ON book.locationID = location.locationID JOIN library_management_system.publisher AS publisher ON book.publisherID = publisher.publisherID WHERE publisher.publisherName LIKE CASE WHEN '"+searchKeyword+"' <> '' THEN '%"+searchKeyword+"%' ELSE CONCAT('%', '', '%') END GROUP BY book.bookISBN, book.bookName, YEAR(book.publicationYear), book.bookEdition, book.totalCopies, book.avaibleCopies, location.shelfName, location.shelfNo, location.floorNo, category.categoryName, publisher.publisherName, publisher.publicationLanguage, author.authorName, author.authorLastName;");
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
                ));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return bookList;    
    }
    
}
