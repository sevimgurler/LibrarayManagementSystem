package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.data.dao.PublisherDao;
import javalibrarymanagement.data.model.Publisher;
import javalibrarymanagement.patterns.SingletonDataWorks;


public class PublisherDaoImpl implements PublisherDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static PublisherDao instance;
    
    public static synchronized PublisherDao getInstance(){
        if (instance == null) {
            instance = new PublisherDaoImpl();
        }
        return instance;
    }


    @Override
    public ArrayList<Publisher> getAllPublisher() {
        ArrayList<Publisher> allPublishers = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.publisher;");
            while(results.next()){
                allPublishers.add(new Publisher(
                        results.getInt("publisherID"),
                        results.getString("publisherName"),
                        results.getString("publicationLanguage")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allPublishers;
    }

    @Override
    public Boolean addPublisher(String publisherName, String language){
        Boolean result = false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`publisher` (`publisherName`, `publicationLanguage`) VALUES ('"+publisherName+"', '"+language+"');"); 
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
