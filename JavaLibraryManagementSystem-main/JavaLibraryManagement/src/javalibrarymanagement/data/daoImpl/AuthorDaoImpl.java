package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.data.dao.AuthorDao;
import javalibrarymanagement.data.model.Author;
import javalibrarymanagement.patterns.SingletonDataWorks;
import java.sql.SQLException;

public class AuthorDaoImpl implements AuthorDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static AuthorDao instance;
    
    public static synchronized AuthorDao getInstance(){
        if (instance == null) {
            instance = new AuthorDaoImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<Author> getAllAuthors() {
        ArrayList<Author> allAuthors = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.author;");
            while(results.next()){
                allAuthors.add(new Author(
                        results.getInt("authorID"),
                        results.getString("authorName"),
                        results.getString("authorLastName")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allAuthors;
    }

    @Override
    public Boolean addAuthor(String name, String surname) {
        Boolean result = false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`author` (`authorName`, `authorLastName`) VALUES ('"+name+"', '"+surname+"');"); 
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
