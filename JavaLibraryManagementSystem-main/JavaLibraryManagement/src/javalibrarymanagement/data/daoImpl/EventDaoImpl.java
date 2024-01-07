package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.EventDao;
import javalibrarymanagement.data.model.Event;


public class EventDaoImpl implements EventDao{

    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;
    private static EventDao instance;
    
    public static synchronized EventDao getInstance(){
        if (instance == null) {
            instance = new EventDaoImpl();
        }
        return instance;
    }
    
    
    @Override
    public ArrayList<Event> getAllEvents() {
        ArrayList<Event> allEvents = new ArrayList<Event>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.events;");
            while(results.next()){
                allEvents.add(new Event(
                        results.getInt("eventID"),
                        results.getString("eventType"),
                        results.getString("eventDate"),
                        results.getString("eventName"),
                        results.getString("eventDesc"),
                        results.getInt("librarianID")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allEvents;
    }

    @Override
    public Boolean deleteEvent(Event event) {
        Boolean result = true;
        try{
            result = statement.execute("DELETE FROM `library_management_system`.`events` WHERE (`eventID` = '"+event.getEventID()+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean updateEvent(Event event) {
        Boolean result = true;
        try{
            result = statement.execute("UPDATE `library_management_system`.`events` SET `eventType` = '"+event.getEventType()+"', `eventName` = '"+event.getEventName()+"', `eventDesc` = '"+event.getEventDesc()+"', `eventDate` = '"+event.getEventDate()+"' WHERE (`eventID` = '"+event.getEventID()+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public Boolean addEvent(Event event, String librarianID) {
        Boolean result = true;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`events` (`eventType`, `eventName`, `eventDesc`, `librarianID`, `eventDate`) VALUES ('"+event.getEventType()+"', '"+event.getEventName()+"', '"+event.getEventDesc()+"', '"+librarianID+"', '"+event.getEventDate()+"');");
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }

    @Override
    public ArrayList<Event> searchWithName(String name) {
        ArrayList<Event> allEvents = new ArrayList<Event>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.events WHERE eventName LIKE '%"+name+"%';");
            while(results.next()){
                allEvents.add(new Event(
                        results.getInt("eventID"),
                        results.getString("eventType"),
                        results.getString("eventName"),
                        results.getString("eventDesc"),
                        results.getString("eventDate"),
                        results.getInt("librarianID")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allEvents;
    }

    @Override
    public ArrayList<Event> searchWithType(String type) {
        ArrayList<Event> allEvents = new ArrayList<Event>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.events WHERE eventType LIKE '%"+type+"%';");
            while(results.next()){
                allEvents.add(new Event(
                        results.getInt("eventID"),
                        results.getString("eventType"),
                        results.getString("eventName"),
                        results.getString("eventDesc"),
                        results.getString("eventDate"),
                        results.getInt("librarianID")
                ));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return allEvents;
    }
    
}
