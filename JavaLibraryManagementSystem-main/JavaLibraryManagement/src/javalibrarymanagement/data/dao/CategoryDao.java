
package javalibrarymanagement.data.dao;

import java.util.ArrayList;
import javalibrarymanagement.data.model.Categories;

public interface CategoryDao {
    
    public ArrayList<Categories> getAllCategories();
    
    public Boolean addCategory(String categoryName);
}
