package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.BookIssueDao;
import javalibrarymanagement.data.model.BookIssue;
import javalibrarymanagement.data.model.Member;


public class BookIssueDaoImpl implements BookIssueDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static BookIssueDao instance;
    
    public static synchronized BookIssueDao getInstance(){
        if (instance == null) {
            instance = new BookIssueDaoImpl();
        }
        return instance;
    }
    
    @Override
    public ArrayList<BookIssue> getMyIssues(Member member) {
        ArrayList<BookIssue> allIssues = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT bi.bookISBN, b.bookName, CASE WHEN bi.issueStatus = 0 THEN 'Borrowed' WHEN bi.issueStatus = 1 THEN 'Returned' ELSE 'Unknown Status' END AS issueStatus, bi.issueDate, bi.returnDate, CONCAT(m.memberName, ' ',m.memberSurname) as member, CONCAT(l.librarianName, ' ', l.librarianSurname) AS librarianName, CONCAT(a.authorName, ' ', a.authorLastName) AS authorName FROM library_management_system.book_issue bi JOIN library_management_system.book b ON bi.bookISBN = b.bookISBN JOIN library_management_system.member m ON bi.memberID = m.memberID JOIN library_management_system.librarian l ON bi.librarianID = l.librarianID JOIN library_management_system.book_author ba ON ba.bookISBN = bi.bookISBN JOIN library_management_system.author a ON ba.authorID = a.authorID WHERE bi.memberID='"+member.getUserID()+"' ORDER BY bi.issueStatus");
            while(results.next()){
                allIssues.add(new BookIssue(
                    results.getString("bookISBN"),
                    results.getString("bookName"),
                    results.getString("authorName"),
                    results.getString("librarianName"),
                    results.getString("issueStatus"),
                    results.getString("issueDate"),
                    results.getString("returnDate"),
                    results.getString("member")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allIssues;
    }

    @Override
    public Boolean returnBook(String returnDate, String memberID, String bookISBN, int bookCopy) {
        Boolean result = true;
        try{
            result = statement.execute("UPDATE `library_management_system`.`book_issue` SET `returnDate` = '"+returnDate+"', `issueStatus` = '1' WHERE (`memberID` = '"+memberID+"') and (`bookISBN` = '"+bookISBN+"');");
            results = statement.executeQuery("SELECT COUNT(*) FROM library_management_system.book_issue WHERE book_issue.bookISBN = '"+bookISBN+"' AND book_issue.issueStatus = 0;");
            results.next();
            int bookCount = bookCopy - results.getInt(0);
            statement.execute("UPDATE `library_management_system`.`book` SET `avaibleCopies` = '"+bookCount+"' WHERE (`bookISBN` = '"+bookISBN+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public ArrayList<BookIssue> getAllIssues() {
        ArrayList<BookIssue> allIssues = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT bi.bookISBN, b.bookName, CASE WHEN bi.issueStatus = 0 THEN 'Borrowed' WHEN bi.issueStatus = 1 THEN 'Returned' ELSE 'Unknown Status' END AS issueStatus, bi.issueDate, bi.returnDate, CONCAT(m.memberName, ' ',m.memberSurname) as member, CONCAT(l.librarianName, ' ', l.librarianSurname) AS librarianName, CONCAT(a.authorName, ' ', a.authorLastName) AS authorName FROM library_management_system.book_issue bi LEFT JOIN library_management_system.book b ON bi.bookISBN = b.bookISBN LEFT JOIN library_management_system.librarian l ON bi.librarianID = l.librarianID LEFT JOIN library_management_system.member m ON m.memberID=bi.memberID LEFT JOIN library_management_system.book_author ba ON ba.bookISBN = bi.bookISBN LEFT JOIN library_management_system.author a ON ba.authorID = a.authorID ORDER BY bi.issueStatus;");
            while(results.next()){
                allIssues.add(new BookIssue(
                    results.getString("bookISBN"),
                    results.getString("bookName"),
                    results.getString("authorName"),
                    results.getString("librarianName"),
                    results.getString("issueStatus"),
                    results.getString("issueDate"),
                    results.getString("returnDate"),
                    results.getString("member")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allIssues;
    }

    @Override
    public Boolean createIssue(String bookISBN,String memberID,int librarianID,String issueDate,String status,int bookCopy) {
        Boolean result = true;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`book_issue` (`bookISBN`, `memberID`, `librarianID`, `issueDate`, `issueStatus`) VALUES ('"+bookISBN+"', '"+memberID+"', '"+librarianID+"', '"+issueDate+"', '"+status+"');");
            results = statement.executeQuery("SELECT COUNT(*) FROM library_management_system.book_issue WHERE book_issue.bookISBN = '"+bookISBN+"' AND book_issue.issueStatus = 0;");
            results.next();
            int bookCount = bookCopy - results.getInt(0);
            statement.execute("UPDATE `library_management_system`.`book` SET `avaibleCopies` = '"+bookCount+"' WHERE (`bookISBN` = '"+bookISBN+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
