package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javalibrarymanagement.data.dao.EventDao;
import javalibrarymanagement.data.dao.LibrarianDao;
import javalibrarymanagement.data.model.Librarian;
import javalibrarymanagement.patterns.SingletonDataWorks;


public class LibrarianDaoImpl implements LibrarianDao{
    
        
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private Librarian findedLibrarian;   
    private static LibrarianDao instance;
    
    public static synchronized LibrarianDao getInstance(){
        if (instance == null) {
            instance = new LibrarianDaoImpl();
        }
        return instance;
    }

    @Override
    public Librarian searchLibrarian(String username, String password) {
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.librarian l WHERE l.librarianUsername='"+username+"' AND l.librarianPassword='"+password+"';");
            if(results.next()){
                findedLibrarian = new Librarian(
                            results.getInt("librarianID"),
                            results.getString("librarianName"),
                            results.getString("librarianSurname"),
                            results.getString("librarianPhone"),
                            results.getString("librarianAdress"),
                            results.getString("librarianMail"),
                            results.getString("librarianUsername")
                    );
            }else{
                return null;
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return findedLibrarian;  
    }
    
}
