
package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Annoucement;
import javalibrarymanagement.data.model.Event;

public interface AnnoucementDao {
    
    public ArrayList<Annoucement> getAllAnnoucements();
        
    public Boolean deleteAnnoucements(Annoucement annoucement);
    
    public Boolean updateAnnoucements(Annoucement annoucement);
    
    public Boolean addAnnoucements(Annoucement annoucement, int librarianID); 
    
    public ArrayList<Annoucement> searchWithName(String name);
    
}
