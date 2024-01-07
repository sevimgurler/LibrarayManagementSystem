package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Publisher;

public interface PublisherDao {
    
    public ArrayList<Publisher> getAllPublisher();
    
    public Boolean addPublisher(String publisherName, String language);
}
