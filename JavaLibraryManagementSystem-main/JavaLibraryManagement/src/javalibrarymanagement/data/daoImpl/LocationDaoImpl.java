package javalibrarymanagement.data.daoImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.data.dao.*;
import javalibrarymanagement.data.model.Location;
import javalibrarymanagement.patterns.SingletonDataWorks;

public class LocationDaoImpl implements LocationDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static LocationDao instance;
    
    public static synchronized LocationDao getInstance(){
        if (instance == null) {
            instance = new LocationDaoImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<Location> getAllLocations() {
        ArrayList<Location> allLocations = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.location;");
            while(results.next()){
                allLocations.add(new Location(
                        results.getInt("locationID"),
                        results.getInt("shelfNo"),
                        results.getString("shelfName"),
                        results.getInt("floorNo")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allLocations;
    }

    @Override
    public Boolean addLocation(int shelfNo, String shelfName, int floorNo) {
        Boolean result = false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`location` (`shelfNo`, `shelfName`, `floorNo`) VALUES ('"+shelfNo+"', '"+shelfName+"', '"+floorNo+"');"); 
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
