package javalibrarymanagement.data.model;


public class Academician extends Member{

    private String title;

    public String getTitle() {
        return title;
    }
    
    public Academician(String memberID, String memberName, String memberSurname, String memberPhone, String memberAddress, String memberMail, String memberUsername, String departmantName, int bookLimit, int avaibleRequestLimit, String title) {
        super(memberID, memberName, memberSurname, memberPhone, memberAddress, memberMail, memberUsername, departmantName, bookLimit, avaibleRequestLimit, "Academician");
        this.title = title;
    }
    
    @Override
    public void printPersonalInfo() {
        super.printPersonalInfo();
        System.out.println("\nTitle: "+title);
    }

    @Override
    public String getUserName() {
        return title+". "+super.getUserName();
    }
    
    
    
}
