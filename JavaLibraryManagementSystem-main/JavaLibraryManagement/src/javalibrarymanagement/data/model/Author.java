package javalibrarymanagement.data.model;

public class Author {

    public int getAuthorID() {
        return authorID;
    }
    private int authorID;
    private String authorName;
    private String authorSurname;

    public Author(int authorID, String authorName, String authorSurname) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    
    public String getAuthorName(){
        return authorName+" "+authorSurname;
    }
}
