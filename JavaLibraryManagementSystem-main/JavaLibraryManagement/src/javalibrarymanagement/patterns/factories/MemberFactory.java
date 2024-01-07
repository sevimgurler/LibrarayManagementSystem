
package javalibrarymanagement.patterns.factories;

import javalibrarymanagement.data.LibraryService;

public class MemberFactory {
    
    private static LibraryService service = LibraryService.getInstance();
    
    public static Boolean createMember(String memberID,String studentNumber, int grade, String title, String userType){
        if(userType.equalsIgnoreCase("Academician")){
           return service.addAcademician(memberID, title);
        }else if(userType.equalsIgnoreCase("Student")){
            return service.addStudent(memberID, studentNumber, grade);
        }else{
            return true;
        }
    }
    
}
