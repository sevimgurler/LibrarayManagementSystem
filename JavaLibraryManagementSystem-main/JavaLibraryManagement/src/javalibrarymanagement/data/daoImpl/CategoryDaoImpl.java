/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalibrarymanagement.data.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javalibrarymanagement.patterns.SingletonDataWorks;
import javalibrarymanagement.data.dao.CategoryDao;
import javalibrarymanagement.data.model.Categories;

public class CategoryDaoImpl implements CategoryDao{
    
    private final Statement statement = SingletonDataWorks.getStatement();
    private ResultSet results;    
    private static CategoryDao instance;
    
    public static synchronized CategoryDao getInstance(){
        if (instance == null) {
            instance = new CategoryDaoImpl();
        }
        return instance;
    }
    
    @Override
    public ArrayList<Categories> getAllCategories() {
        ArrayList<Categories> categoryList = new ArrayList<>();
        try{
            results = statement.executeQuery("SELECT * FROM library_management_system.category;");
            while(results.next()){
                categoryList.add(new Categories(
                results.getInt("categoryID"),
                results.getString("categoryName")
                ));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return categoryList;
    }

    @Override
    public Boolean addCategory(String categoryName) {
        Boolean result = false;
        try{
            result = statement.execute("INSERT INTO `library_management_system`.`category` (`categoryName`) VALUES ('"+categoryName+"');"); 
        }catch(SQLException e){
            System.err.println(e);
        }
        return result;
    }
    
}
