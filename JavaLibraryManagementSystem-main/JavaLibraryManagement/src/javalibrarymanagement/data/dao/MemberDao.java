package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Member;


public interface MemberDao {
    
    public ArrayList<Member> getAllMembers();
    
    public ArrayList<Member> searchMembersWithID(String searchKeyword);
    
    public ArrayList<Member> searchMembersWithName(String searchKeyword);
    
    public Member searchAcademician(String username, String password);
    
    public Member searchStudent(String username, String password);
      
    public Boolean addMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, String memberPassword, int bookLimit, int departmantID, String studentNumber, int grade, String title, String userType);
    
    public Boolean addAcademician(String memberID, String title);

    public Boolean addStudent(String memberID, String studentNumber, int grade);
    
    public Boolean updateMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, int departmantID, String studentNumber, int grade, String title, String userType);
    
    public Boolean updateAcademician(String memberID, String title);
    
    public Boolean updateStudent(String memberID, String studentNumber, int grade);
    
    public Boolean deleteMember(String memberID, String memberType);
    
}
