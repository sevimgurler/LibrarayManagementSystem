package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Event;


public interface EventDao {
    
    public ArrayList<Event> getAllEvents();
    
    public Boolean deleteEvent(Event event);
    
    public Boolean updateEvent(Event event);
    
    public Boolean addEvent(Event event, String librarianID); 
    
    public ArrayList<Event> searchWithName(String name);
    
    public ArrayList<Event> searchWithType(String type);

}
