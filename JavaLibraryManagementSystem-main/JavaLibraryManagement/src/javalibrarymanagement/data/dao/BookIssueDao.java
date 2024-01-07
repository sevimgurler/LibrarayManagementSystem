package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.BookIssue;
import javalibrarymanagement.data.model.Member;

public interface BookIssueDao {
    
    public ArrayList<BookIssue> getMyIssues(Member member);
    
    public Boolean returnBook(String returnDate, String memberID, String bookISBN,int bookCopy);
    
    public ArrayList<BookIssue> getAllIssues();
    
    public Boolean createIssue(String bookISBN,String memberID,int librarianID,String issueDate,String status,int bookCopy);
}
