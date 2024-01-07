package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Location;

public interface LocationDao {
    
    public ArrayList<Location> getAllLocations();
    
    public Boolean addLocation(int shelfNo, String shelfName, int floorNo);
    
}
