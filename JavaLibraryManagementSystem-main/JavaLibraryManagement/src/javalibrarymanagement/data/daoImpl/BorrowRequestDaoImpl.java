package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.BorrowRequestDao;
import javalibrarymanagement.data.model.BorrowRequest;
import javalibrarymanagement.data.model.Member;

public class BorrowRequestDaoImpl implements BorrowRequestDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static BorrowRequestDao instance;
    
    public static synchronized BorrowRequestDao getInstance(){
        if (instance == null) {
            instance = new BorrowRequestDaoImpl();
        }
        return instance;
    }
    
    @Override
    public ArrayList<BorrowRequest> getMemberRequests(String memberID) {
        ArrayList<BorrowRequest> borrowRequestList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT b.bookISBN, b.bookName, CONCAT(m.memberName, ' ', m.memberSurname) AS memberName, CONCAT(a.authorName, ' ', a.authorLastName) AS authorName, DATE_FORMAT(br.requestDate, '%d %M %Y') AS requestDate, CASE WHEN br.requestStatus = 0 THEN 'Created' WHEN br.requestStatus = 1 THEN 'Approved' WHEN br.requestStatus = 2 THEN 'Rejected' WHEN br.requestStatus = 3 THEN 'Closed' ELSE 'Unknown Status' END AS requestStatusLabel FROM library_management_system.book_request br JOIN library_management_system.book b ON br.bookID = b.bookISBN JOIN library_management_system.book_author ba ON b.bookISBN = ba.bookISBN JOIN library_management_system.author a ON ba.authorID = a.authorID JOIN library_management_system.member m ON br.memberID = m.memberID WHERE br.memberID = '"+memberID+"';");
            while(results.next()){
                borrowRequestList.add(new BorrowRequest(
                    results.getString("bookISBN"),
                    results.getString("bookName"),
                    results.getString("authorName"),
                    results.getString("requestDate"),
                    results.getString("requestStatusLabel"),
                    results.getString("memberName")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return borrowRequestList;
    }

    @Override
    public Boolean isSelectedBookRequested(Member member, String bookID) {
        int count=0;
        try{
            results = statement.executeQuery("SELECT COUNT(*) FROM `library_management_system`.`book_request` WHERE `memberID` = '" + member.getUserID() + "' AND `bookID` = '" + bookID + "'");
            results.next();
            count = results.getInt(1);
        }catch(SQLException e){
            System.err.println(e);
        }
        return count==0;
    }

    @Override
    public Boolean createBorrowRequest(String bookID, Member member, String requestDate) {
        Boolean result = false;
        try{
            String insertQuery = "INSERT INTO `library_management_system`.`book_request` (`bookID`, `memberID`, `requestDate`, `requestStatus`) VALUES ('" + bookID + "', '" + member.getUserID() + "', '" + requestDate + "', '0')";
            result  = statement.execute(insertQuery);
            int avaibleRequest = member.getMemberCurrentRight()-1;
            int currentRequest = member.getMemberRight()-avaibleRequest;
            member.setAvaibleRequestLimit(avaibleRequest);
            statement.execute("UPDATE `library_management_system`.`member_request_limit` SET `currentRequestCount` = '"+currentRequest+"', `avaibleRequestCount` = '"+avaibleRequest+"' WHERE (`memberID` = '"+member.getUserID()+"');");
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean deleteBorrowRequestFromUser(String bookID, Member member) {
        Boolean result = false;
        try{
            int avaibleRequest = member.getMemberCurrentRight()+1;
            int currentRequest = member.getMemberRight()-avaibleRequest;
            member.setAvaibleRequestLimit(avaibleRequest);
            statement.execute("UPDATE `library_management_system`.`member_request_limit` SET `currentRequestCount` = '"+currentRequest+"', `avaibleRequestCount` = '"+avaibleRequest+"' WHERE (`memberID` = '"+member.getUserID()+"');");
            result = statement.execute("DELETE FROM `library_management_system`.`book_request` WHERE `bookID` = '"+bookID+"' AND memberID='"+member.getUserID()+"';");
        }catch(SQLException e){
            System.err.println(e);
        }     
        return result;
    }

    @Override
    public ArrayList<BorrowRequest> gelAllRequests() {
        ArrayList<BorrowRequest> borrowRequestList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT b.bookISBN, b.bookName, CONCAT(m.memberName, ' ', m.memberSurname) AS memberName, CONCAT(a.authorName, ' ', a.authorLastName) AS authorName, DATE_FORMAT(br.requestDate, '%d %M %Y') AS requestDate, CASE WHEN br.requestStatus = 0 THEN 'Created' WHEN br.requestStatus = 1 THEN 'Approved' WHEN br.requestStatus = 2 THEN 'Rejected' WHEN br.requestStatus = 3 THEN 'Closed' ELSE 'Unknown Status' END AS requestStatusLabel FROM library_management_system.book_request br JOIN library_management_system.book b ON br.bookID = b.bookISBN JOIN library_management_system.book_author ba ON b.bookISBN = ba.bookISBN JOIN library_management_system.author a ON ba.authorID = a.authorID JOIN library_management_system.member m ON br.memberID = m.memberID;");
            while(results.next()){
                borrowRequestList.add(new BorrowRequest(
                    results.getString("bookISBN"),
                    results.getString("bookName"),
                    results.getString("authorName"),
                    results.getString("requestDate"),
                    results.getString("requestStatusLabel"),
                    results.getString("memberName")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return borrowRequestList;
    }

    @Override
    public Boolean approveRequest(String memberID, String bookISBN) {
        Boolean result = false;
        try{
            statement.execute("UPDATE `library_management_system`.`book_request` SET `requestStatus` = '1' WHERE (`memberID` = '"+memberID+"') AND (`bookID`='"+bookISBN+"');");
        }catch(SQLException e){
            System.err.println(e);
        }     
        return result;
    }

    @Override
    public Boolean rejectRequest(String memberID, String bookISBN) {
        Boolean result = false;
        try{
            statement.execute("UPDATE `library_management_system`.`book_request` SET `requestStatus` = '2' WHERE (`memberID` = '"+memberID+"') AND (`bookID`='"+bookISBN+"');");
        }catch(SQLException e){
            System.err.println(e);
        }     
        return result;
    }

    @Override
    public Boolean closeRequest(String memberID, String bookISBN) {
        Boolean result = false;
        try{
            statement.execute("UPDATE `library_management_system`.`book_request` SET `requestStatus` = '3' WHERE (`memberID` = '"+memberID+"') AND (`bookID`='"+bookISBN+"');");   
        }catch(SQLException e){
            System.err.println(e);
        }     
        return result;
    }
    
}
