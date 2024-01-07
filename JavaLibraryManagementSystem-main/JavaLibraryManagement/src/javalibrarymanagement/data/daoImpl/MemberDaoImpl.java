/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.MemberDao;
import javalibrarymanagement.data.model.Academician;
import javalibrarymanagement.data.model.Member;
import javalibrarymanagement.data.model.Student;
import javalibrarymanagement.patterns.factories.MemberFactory;


public class MemberDaoImpl implements MemberDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private Member findedMember;    
    private static MemberDao instance;
    
    public static synchronized MemberDao getInstance(){
        if (instance == null) {
            instance = new MemberDaoImpl();
        }
        return instance;
    }
    
    @Override
    public Member searchAcademician(String username, String password) { 
        try{
            results = statement.executeQuery("SELECT m.memberID, m.memberName, m.memberSurname, m.memberPhone, m.memberAdress, m.memberMail, m.memberUserName, m.memberPassword, d.departmantName, b.bookLimit, a.title, mrq.avaibleRequestCount FROM library_management_system.member m JOIN library_management_system.academician a ON m.memberID = a.memberID LEFT JOIN library_management_system.departmant d ON m.departmantID = d.departmantID LEFT JOIN library_management_system.book_limit b ON m.bookLimitID = b.bookLimitID LEFT JOIN library_management_system.member_request_limit mrq ON m.memberID = mrq.memberID WHERE m.memberUserName = '"+username+"'  AND m.memberPassword = '"+password+"';");
            if(results.next()){
                findedMember = new Academician(
                            results.getString("memberID"),
                            results.getString("memberName"),
                            results.getString("memberSurname"),
                            results.getString("memberPhone"),
                            results.getString("memberAdress"),
                            results.getString("memberMail"),
                            results.getString("memberUsername"),
                            results.getString("departmantName"),
                            results.getInt("bookLimit"),
                            results.getInt("avaibleRequestCount"),
                            results.getString("title")
                    );
            }else{
                return null;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return findedMember;            
    }

    @Override
    public Member searchStudent(String username, String password) {
        try{
            results = statement.executeQuery("SELECT m.memberID, m.memberName, m.memberSurname, m.memberPhone, m.memberAdress, m.memberMail, m.memberUserName, m.memberPassword, d.departmantName, b.bookLimit, s.grade, s.studentNumber, mrq.avaibleRequestCount FROM library_management_system.member m JOIN library_management_system.student s ON m.memberID = s.memberID LEFT JOIN library_management_system.departmant d ON m.departmantID = d.departmantID LEFT JOIN library_management_system.book_limit b ON m.bookLimitID = b.bookLimitID LEFT JOIN library_management_system.member_request_limit mrq ON m.memberID = mrq.memberID WHERE m.memberUserName = '"+username+"'  AND m.memberPassword = '"+password+"';");
            if(results.next()){
                findedMember = new Student(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUsername"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getInt("grade"),
                        results.getString("studentNumber")
                    );
            }else{
                return null;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return findedMember;
    }

    @Override
    public ArrayList<Member> getAllMembers() {
        ArrayList<Member> memberList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT m.memberID, m.memberName, m.memberSurname, m.memberPhone, m.memberAdress, m.memberMail, m.memberUserName, d.departmantName, mrq.avaibleRequestCount, CONCAT(mrq.avaibleRequestCount+mrq.currentRequestCount) AS bookLimit, CASE WHEN a.memberID IS NOT NULL THEN 'Academician' WHEN s.memberID IS NOT NULL THEN 'Student' ELSE 'Unkown' END AS memberType, a.title, s.grade, s.studentNumber FROM library_management_system.member m LEFT JOIN library_management_system.departmant d ON m.departmantID = d.departmantID LEFT JOIN library_management_system.member_request_limit mrq ON mrq.memberID = m.memberID LEFT JOIN library_management_system.academician a ON a.memberID = m.memberID LEFT JOIN library_management_system.student s ON s.memberID = m.memberID;");
            while(results.next()){
                if("Academician".equals(results.getString("memberType"))){
                    memberList.add(new Academician(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUserName"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getString("title")
                    ));
                }else if("Student".equals(results.getString("memberType"))){
                    memberList.add(new Student(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUserName"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getInt("grade"),
                        results.getString("studentNumber")                           
                    ));
                }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return memberList;
    }

    @Override
    public ArrayList<Member> searchMembersWithID(String searchKeyword) {
        ArrayList<Member> memberList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT m.memberID, m.memberName, m.memberSurname, m.memberPhone, m.memberAdress, m.memberMail, m.memberUserName, d.departmantName, mrq.avaibleRequestCount, CONCAT(mrq.avaibleRequestCount+mrq.currentRequestCount) AS bookLimit, CASE WHEN a.memberID IS NOT NULL THEN 'Academician' WHEN s.memberID IS NOT NULL THEN 'Student' ELSE 'Unkown' END AS memberType, a.title, s.grade, s.studentNumber FROM library_management_system.member m LEFT JOIN library_management_system.departmant d ON m.departmantID = d.departmantID LEFT JOIN library_management_system.member_request_limit mrq ON mrq.memberID = m.memberID LEFT JOIN library_management_system.academician a ON a.memberID = m.memberID LEFT JOIN library_management_system.student s ON s.memberID = m.memberID WHERE m.memberID LIKE '%"+searchKeyword+"%'");
            while(results.next()){
                if("Academician".equals(results.getString("memberType"))){
                    memberList.add(new Academician(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUsername"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getString("title")
                    ));
                }else if("Student".equals(results.getString("memberType"))){
                    memberList.add(new Student(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUsername"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getInt("grade"),
                        results.getString("studentNumber")                           
                    ));
                }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return memberList;
    }

    @Override
    public ArrayList<Member> searchMembersWithName(String searchKeyword) {
        ArrayList<Member> memberList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT m.memberID, m.memberName, m.memberSurname, m.memberPhone, m.memberAdress, m.memberMail, m.memberUserName, d.departmantName, mrq.avaibleRequestCount, CONCAT(mrq.avaibleRequestCount+mrq.currentRequestCount) AS bookLimit, CASE WHEN a.memberID IS NOT NULL THEN 'Academician' WHEN s.memberID IS NOT NULL THEN 'Student' ELSE 'Unkown' END AS memberType, a.title, s.grade, s.studentNumber FROM library_management_system.member m LEFT JOIN library_management_system.departmant d ON m.departmantID = d.departmantID LEFT JOIN library_management_system.member_request_limit mrq ON mrq.memberID = m.memberID LEFT JOIN library_management_system.academician a ON a.memberID = m.memberID LEFT JOIN library_management_system.student s ON s.memberID = m.memberID WHERE CONCAT(m.memberName, ' ', m.memberSurname) LIKE '%"+searchKeyword+"%'");
            while(results.next()){
                if("Academician".equals(results.getString("memberType"))){
                    memberList.add(new Academician(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUsername"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getString("title")
                    ));
                }else if("Student".equals(results.getString("memberType"))){
                    memberList.add(new Student(
                        results.getString("memberID"),
                        results.getString("memberName"),
                        results.getString("memberSurname"),
                        results.getString("memberPhone"),
                        results.getString("memberAdress"),
                        results.getString("memberMail"),
                        results.getString("memberUsername"),
                        results.getString("departmantName"),
                        results.getInt("bookLimit"),  
                        results.getInt("avaibleRequestCount"),
                        results.getInt("grade"),
                        results.getString("studentNumber")                           
                    ));
                }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return memberList;
    }

    @Override
    public Boolean addMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, String memberPassword, int bookLimit, int departmantID, String studentNumber, int grade, String title, String userType) {
        Boolean result=true;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`member` (`memberID`, `memberName`,`memberSurname`,`memberPhone`,`memberMail`,`memberUserName`,`memberPassword`,`memberAdress`,`bookLimitID`,`departmantID`) VALUES ('"+memberID+"', '"+memberName+"','"+memberSurname+"', '"+memberPhone+"','"+memberMail+"', '"+memberUsername+"','"+memberPassword+"', '"+memberAddress+"','"+bookLimit+"', '"+departmantID+"');");       
            System.err.println("in "+result);
            if(!result){
                result = MemberFactory.createMember(memberID, studentNumber, grade, title, userType);
                if(!result){
                    switch(bookLimit){
                        case 1 -> result = statement.execute("INSERT INTO `library_management_system`.`member_request_limit` (`memberID`, `currentRequestCount`, `avaibleRequestCount`) VALUES ('"+memberID+"', '"+0+"', '"+5+"');");
                        case 2 -> result = statement.execute("INSERT INTO `library_management_system`.`member_request_limit` (`memberID`, `currentRequestCount`, `avaibleRequestCount`) VALUES ('"+memberID+"', '"+0+"', '"+3+"');");
                        default -> {}
                    }
                }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean addAcademician(String memberID, String title) {
        Boolean result=false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`academician` (`memberID`,`title`) VALUES ('"+memberID+"','"+title+"')");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean addStudent(String memberID, String studentNumber, int grade) {
        Boolean result=false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`student` (`memberID`,`studentNumber`,`grade`) VALUES ('"+memberID+"','"+studentNumber+"','"+grade+"')");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean updateMember(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, int departmantID, String studentNumber, int grade, String title, String userType) {
        Boolean result=false;
        try{
            result = statement.execute("UPDATE `library_management_system`.`member` SET `memberName` = '"+memberName+"', `memberSurname` = '"+memberSurname+"', `memberPhone` = '"+memberPhone+"', `memberAdress` = '"+memberAddress+"', `memberMail` = '"+memberMail+"', `memberUserName` = '"+memberUsername+"', `departmantID` = '"+departmantID+"' WHERE (`memberID` = '"+memberID+"');");
            if(!result){
                if("Academician".equals(userType)){
                    result = updateAcademician(memberID, title);
                }else if("Student".equals(userType)){
                    result = updateStudent(memberID, studentNumber, grade);
                }
            }        
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean updateAcademician(String memberID, String title) {
        Boolean result=false;
        try{
            result = statement.execute("UPDATE `library_management_system`.`academician` SET `title` = '"+title+"' WHERE (`memberID` = '"+memberID+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean updateStudent(String memberID, String studentNumber, int grade) {
        Boolean result=false;
        try{
            result = statement.execute("UPDATE `library_management_system`.`student` SET `grade` = '"+grade+"', `studentNumber` = '"+studentNumber+"' WHERE (`memberID` = '"+memberID+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean deleteMember(String memberID, String memberType) {
        Boolean result=false;
        try{
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM `library_management_system`.`book_issue` WHERE (`memberID` = '"+memberID+"' AND `issueStatus` = 0);");
            rs.next();
            if(rs.getInt(1)==0){
                if("Academician".equals(memberType)){
                    result = statement.execute("DELETE FROM `library_management_system`.`academician` WHERE (`memberID` = '"+memberID+"');");
                }else if("Student".equals(memberType)){
                    result = statement.execute("DELETE FROM `library_management_system`.`student` WHERE (`memberID` = '"+memberID+"');");
                }
                if(!result){
                    if(!statement.execute("DELETE FROM `library_management_system`.`book_request` WHERE (`memberID` = '"+memberID+"+');")){
                        if(!statement.execute("DELETE FROM `library_management_system`.`book_issue` WHERE (`memberID` = '"+memberID+"' AND `issueStatus` = 1);")){
                            if(!statement.execute("DELETE FROM `library_management_system`.`member_request_limit` WHERE (`memberID` = '"+memberID+"');")){
                                return !statement.execute("DELETE FROM `library_management_system`.`member` WHERE (`memberID` = '"+memberID+"');");
                            }
                        }
                    }
                }   
            }else{
                return false;
            }
            result = statement.execute("");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    
}
