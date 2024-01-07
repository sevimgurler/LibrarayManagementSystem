package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Author;

public interface AuthorDao {
    
    public ArrayList<Author> getAllAuthors();
    
    public Boolean addAuthor(String name, String surname);
    
}
