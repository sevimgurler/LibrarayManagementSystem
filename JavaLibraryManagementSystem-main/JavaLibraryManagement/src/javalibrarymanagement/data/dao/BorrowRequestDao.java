
package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.BorrowRequest;
import javalibrarymanagement.data.model.Member;

public interface BorrowRequestDao {
    
    public ArrayList<BorrowRequest> gelAllRequests();
    
    public ArrayList<BorrowRequest> getMemberRequests(String memberID);
    
    public Boolean isSelectedBookRequested(Member member, String bookID);
    
    public Boolean createBorrowRequest(String bookID, Member member, String requestDate);
    
    public Boolean deleteBorrowRequestFromUser(String bookID, Member member);
    
    public Boolean approveRequest(String memberID, String bookISBN);
    
    public Boolean rejectRequest(String memberID, String bookISBN);
    
    public Boolean closeRequest(String memberID, String bookISBN);
}

