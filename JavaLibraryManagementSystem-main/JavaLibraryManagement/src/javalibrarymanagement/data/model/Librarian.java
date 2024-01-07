package javalibrarymanagement.data.model;

public class Librarian {

    private int librarianID;

    public int getLibrarianID() {
        return librarianID;
    }
    private String librarianName;
    private String librarianSurname;
    private String librarianPhone;
    private String librarianAddress;
    private String librarianMail;
    private String librarianUsername;

    public Librarian(int librarianID, String librarianName, String librarianSurname, String librarianPhone, String librarianAddress, String librarianMail, String librarianUsername) {
        this.librarianID = librarianID;
        this.librarianName = librarianName;
        this.librarianSurname = librarianSurname;
        this.librarianPhone = librarianPhone;
        this.librarianAddress = librarianAddress;
        this.librarianMail = librarianMail;
        this.librarianUsername = librarianUsername;
    }
    
    public String getLibrarianName(){
        return librarianName+" "+librarianSurname;
    }


}
