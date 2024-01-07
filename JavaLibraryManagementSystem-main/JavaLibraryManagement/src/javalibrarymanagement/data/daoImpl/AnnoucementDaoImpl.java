package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.AnnoucementDao;
import javalibrarymanagement.data.model.Annoucement;
import javalibrarymanagement.data.model.Event;

public class AnnoucementDaoImpl implements AnnoucementDao {
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static AnnoucementDao instance;
    
    public static synchronized AnnoucementDao getInstance(){
        if (instance == null) {
            instance = new AnnoucementDaoImpl();
        }
        return instance;
    }

    @Override
    public ArrayList<Annoucement> getAllAnnoucements() {
        ArrayList<Annoucement> allAnnoucement = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.annoucements;");
            while(results.next()){
                allAnnoucement.add(new Annoucement(
                        results.getInt("annoucementID"),
                        results.getString("annoucementsName"),
                        results.getString("annoucementsDesc"),
                        results.getString("annoucementsDate"),
                        results.getInt("librarianID")
                        
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allAnnoucement;
    }
    
        @Override
    public Boolean deleteAnnoucements(Annoucement annoucement) {
        Boolean result = true;
        try{
            result = statement.execute("DELETE FROM `library_management_system`.`annoucements` WHERE (`annoucementID` = '"+annoucement.getAnnoucementID()+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
     public Boolean updateAnnoucements(Annoucement annoucement) {
        Boolean result = true;
        try{
            result = statement.execute("UPDATE `library_management_system`.`annoucements` SET `annoucementsName` = '"+annoucement.getAnnoucementName()+"', `annoucementsDesc` = '"+annoucement.getAnnoucementDesc()+"', `annoucementsDate` = '"+annoucement.getAnnoucementDate()+"' WHERE (`annoucementID` = '"+annoucement.getAnnoucementID()+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean addAnnoucements(Annoucement annoucement, int librarianID) {
        Boolean result = true;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`annoucements` (`annoucementsName`, `annoucementsDesc`, `annoucementsDate`, `librarianID`) VALUES ('"+annoucement.getAnnoucementName()+"', '"+annoucement.getAnnoucementDesc()+"', '"+annoucement.getAnnoucementDate()+"', '"+librarianID+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public ArrayList<Annoucement> searchWithName(String name) {
        ArrayList<Annoucement> allAnnoucement = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.annoucements WHERE annoucementsName LIKE '%"+name+"%';");
            while(results.next()){
                allAnnoucement.add(new Annoucement(
                        results.getInt("annoucementID"),
                        results.getString("annoucementsName"),
                        results.getString("annoucementsDesc"),
                        results.getString("annoucementsDate"),
                        results.getInt("librarianID")
                        
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allAnnoucement;
    }

    
}